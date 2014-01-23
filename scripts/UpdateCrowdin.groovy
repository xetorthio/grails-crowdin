includeTargets << grailsScript("Init")

target(main: "Update crowdin translation files") {
    def config = new ConfigSlurper().parse(new File('grails-app/conf/CrowdinConf.groovy').toURL())
    exec executable:"curl", {
        arg line:"-F \"files[Messages.po]=@grails-app/i18n/Messages.po\" https://crowdin.net/api/project/${config.crowdin.projectid}/update-file?key=${config.crowdin.apikey}"
    }
}

setDefaultTarget(main)
