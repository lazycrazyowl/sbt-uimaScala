releaseSettings

sbtPlugin := true

organization := "com.github.jenshaase.uimascala"

name := "uimascala-sbt-plugin"

scalacOptions += "-deprecation"

libraryDependencies += "org.apache.uima" % "uimaj-tools" % "2.3.1"

publishTo := Some(Resolver.file("Local", Path.userHome / "dev" / "jenshaase.github.com" / "maven" asFile))
