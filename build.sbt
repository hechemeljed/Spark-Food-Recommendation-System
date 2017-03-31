name := "blog-spark-recommendation"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.4"

val sparkVersion = "1.0.1"

val akkaVersion = "2.2.3" // override Akka to be this version to match the one in Spark

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  // HTTP client
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.1",
  // HTML parser
  "org.jodd" % "jodd-lagarto" % "3.5.2",
  // Spark
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  // Akka
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  // MongoDB
  "org.reactivemongo" %% "reactivemongo" % "0.10.0"
)

play.Project.playScalaSettings
