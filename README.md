# Play Scala.js Source Maps

[![Latest Version](https://maven-badges.herokuapp.com/maven-central/com.vmunier/play-scalajs-sourcemaps_2.11/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.vmunier/play-scalajs-sourcemaps_2.11)
[![License](http://img.shields.io/:license-Apache%202-red.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

play-scalajs-sourcemaps is a library which is used when mixing a Play project with a Scala.js project.
It provides a SourceMaps Play controller which handles sending the Scala files to the browser.

* SourceMaps can be enabled/disabled by setting the config key `playscalajs.sourcemaps.enabled` to true/false in your Play config.
* By default, when no source maps config key is found, Source Maps is enabled in dev but disabled in production to prevent your users from seeing the source files.
