import Dependencies._

ThisBuild / scalaVersion     := "2.12.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scalaseed",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

// credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "io.github.hyperchessbot" % "sonascalautils_2.12" % "0.1.0-SNAPSHOT"

