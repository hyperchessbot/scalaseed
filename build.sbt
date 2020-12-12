import Dependencies._

ThisBuild / scalaVersion := "2.12.1"

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "io.github.hyperchessbot" % "sonascalautils_2.12" % "0.1.0-SNAPSHOT"
