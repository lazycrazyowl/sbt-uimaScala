resolvers += "gseitz@github" at "http://gseitz.github.com/maven/"

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.4")

resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe.sbtscalariform" % "sbtscalariform" % "0.3.0")