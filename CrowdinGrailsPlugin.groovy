class CrowdinGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.2.2 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "lib",
            "src",
            "target",
            "test",
            "web-app",
            "grails-app"
    ]

    def author = "Jonathan Leibiusky"
    def authorEmail = "ionathan@gmail.com"
    def title = "Grails Crowdin API plugin"
    def description = "This is a plugin for grails that adds scripts to update and download translation files to/from crowdin.net, using the API."
    // URL to the plugin's documentation
    def documentation = "http://github.com/xetorthio/grails-crowdin"
}
