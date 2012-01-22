sbtPlugin := true

organization := "com.github.jenshaase.uimascala"

name := "uimascala-sbt-plugin"

scalacOptions += "-deprecation"

libraryDependencies += "org.apache.uima" % "uimaj-tools" % "2.3.1"

import sbtrelease.Release._

seq(releaseSettings: _*)

publishTo := Some(Resolver.file("Local", Path.userHome / "programming" / "jenshaase.github.com" / "maven" asFile))