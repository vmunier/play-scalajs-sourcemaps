# Play Scala.js Source Maps

play-scalajs-sourcemaps is a library which is used when mixing a Play project with a Scala.js project.
It provides a SourceMaps Play controller which handles sending the Scala files to the browser.

* SourceMaps can be enabled/disabled by setting the config key `playscalajs.sourcemaps.enabled` to true/false in your Play config.
* By default, when no source maps config key is found, Source Maps is enabled in dev but disabled in production to prevent your users from seeing the source files.
