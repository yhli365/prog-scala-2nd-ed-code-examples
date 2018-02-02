resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases",
  "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  Classpaths.typesafeResolver
)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4") // "3.0.0"
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
