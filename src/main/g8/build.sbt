name := """$name$"""
version := "1.0-SNAPSHOT"
scalaVersion := "2.12.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
pipelineStages := Seq(digest)

libraryDependencies ++= Seq(
  jdbc,
  caffeine,
  ws,
  guice
)

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
