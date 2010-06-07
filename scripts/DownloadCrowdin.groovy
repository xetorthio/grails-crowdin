includeTargets << grailsScript("Init")

target(main: "Download translations from crowdin and replace them with the current files") {
    def config = new ConfigSlurper().parse(new File('grails-app/conf/CrowdinConf.groovy').toURL())
    delete dir:"target/translationTemp"
    mkdir dir:"target/translationTemp"
    get src:"http://crowdin.net/api/project/${config.crowdin.projectid}/download/all.zip?key=${config.crowdin.apikey}", dest:"target/translationTemp/all.zip"
    unzip src:"target/translationTemp/all.zip", dest:"target/translationTemp"
    delete file:"target/translationTemp/all.zip"
    def list = new File("target/translationTemp")
    list.eachFile {
        def lang = it.name.replaceAll(/\-/, "_")
        copy file:"${it}/Messages.po", tofile:"grails-app/i18n/${lang}.po"
    }    
}

setDefaultTarget(main)
