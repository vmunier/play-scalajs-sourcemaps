name := "play-scalajs-sourcemaps"

version := "0.1.0-SNAPSHOT"

organization := "com.vmunier"

crossScalaVersions := Seq("2.10.4", "2.11.2")

enablePlugins(play.PlayScala)

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

pomExtra := (
  <scm>
    <url>git@github.com:vmunier/play-scalajs-sourcemaps.git</url>
    <connection>scm:git:git@github.com:vmunier/play-scalajs-sourcemaps.git</connection>
  </scm>
  <developers>
    <developer>
      <id>vmunier</id>
      <name>Vincent Munier</name>
      <url>https://github.com/vmunier</url>
    </developer>
  </developers>
)
