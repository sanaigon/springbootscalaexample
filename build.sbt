name := "springbootscalaexample"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "2.5.1",
  "org.springframework.boot" % "spring-boot-configuration-processor" % "2.5.1",
  "org.springframework.boot" % "spring-boot-starter-test" % "2.5.1"
)


// enable the Java app packaging archetype
enablePlugins(JavaServerAppPackaging)