name := "learning_scala"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies += "com.lihaoyi" % "ammonite" % "1.0.1" % "test" cross CrossVersion.full

sourceGenerators in Test += Def.task {
  val file = (sourceManaged in Test).value / "amm.scala"
  IO.write(file, """object amm extends App { ammonite.Main().run() }""")
  Seq(file)
}.taskValue

/* sbt test:run */
