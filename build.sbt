ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "UT-IT-Assignment-Session6",
    idePackagePrefix := Some("com.knoldus")
  )
val scalaTest = "org.scalatest" %% "scalatest" % "3.2.15" % Test

lazy val Module1 = project
  .settings(
    name := "Module1",
    idePackagePrefix := Some("kup.knoldus.utit"),
    libraryDependencies += scalaTest,
    libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
      "ch.qos.logback" % "logback-classic" % "1.3.5"
    )
  )

lazy val Module2 = project
  .settings(
    name := "Module2",
    idePackagePrefix := Some("kup.knoldus.utit"),
    libraryDependencies += scalaTest,
    libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
      "ch.qos.logback" % "logback-classic" % "1.3.5"
    )
  )


