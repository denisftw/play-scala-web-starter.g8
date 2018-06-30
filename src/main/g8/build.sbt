name := """$name$"""
version := "1.0-SNAPSHOT"
scalaVersion := "2.12.6"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
pipelineStages := Seq(digest)

libraryDependencies ++= Seq(
  jdbc,
  ehcache,
  ws,
  guice
)

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"