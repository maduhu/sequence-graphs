// Set up the Avro code generator

seq( sbtavro.SbtAvro.avroSettings : _*)

(stringType in avroConfig) := "String"

// This is a library, not an application, so no native packager setup is needed.

name := "Sequence Graph API"

version := "0.1"

scalaVersion := "2.9.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "0.9.0-incubating-SNAPSHOT"

libraryDependencies += "org.apache.spark" %% "spark-graphx" % "0.9.0-incubating-SNAPSHOT"

// We need this library for testing

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.2" % "test"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"



