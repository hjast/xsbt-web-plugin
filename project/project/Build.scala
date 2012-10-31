import sbt._
import Keys._

object PluginDef extends Build {
	lazy val root = Project("plugins", file(".")) settings(
		libraryDependencies ++= Seq(
			("org.scala-sbt" % "scripted-plugin" % "0.12.1"),
			("com.github.siasia" %% "oss-sonatype-plugin" % ("0.12.0"+"-0.1") )
		)
	)
}
