enablePlugins(JavaAppPackaging)
maintainer in Docker := "$maintainer$"
packageName in Docker := "$dhuser$/$name$"
packageSummary in Docker := "$desc$"
packageDescription := "$desc$"
dockerExposedPorts := List(8080)
dockerBaseImage := "frolvlad/alpine-scala"
