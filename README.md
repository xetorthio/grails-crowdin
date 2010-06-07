# Crowdin

Grails Crowdin is a plugin for Grails that adds scripts to handle translations through their API

## Usage

To install just type:

    grails install-plugin http://github.com/downloads/xetorthio/grails-crowdin/grails-crowdin-0.1.zip

To update translations in crowdin, just type:
    grails update-crowdin

This will upload the Messages.po in your grails-app/i18n folder. This will enable translators new strings to translate.

When you want to update your project with new translations from crowdin just type:
    grails download-crowdin

This will update your grails-app/i18n folder with fresh translations from crowdin.

## Configuring
You should configure this plugin with the project created in crowdin.net
Create a file named CrowdinConf.groovy in grails-app/conf with a configuration similar to the following:

    crowdin {
        projectid = "atest"
        apikey = "6355efc31d083c1eaa50866be0e01e08"
    }

Remember to change these configurations with the ones of your own project.


License
-------

Copyright (c) 2010 Jonathan Leibiusky

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

