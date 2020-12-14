import Dependencies._

ThisBuild / scalaVersion         := "2.13.0"
ThisBuild / version              := "0.1.0-SNAPSHOT"
ThisBuild / organization         := "com.example"
ThisBuild / organizationName     := "example"
ThisBuild / libraryDependencies  += scalaTest % Test
ThisBuild / libraryDependencies  += "io.github.hyperchessbot" % "scalautils_2.13" % "1.0.0"
ThisBuild / resolvers            += "Artifactory" at "https://hyperbot.jfrog.io/artifactory/hyperbot/"

lazy val root = (project in file("."))
	.settings(
		name                 := "scalaseed"
	)
