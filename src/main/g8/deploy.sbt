enablePlugins(JavaAppPackaging)
maintainer in Docker := "$maintainer$"
packageName in Docker := "$dhuser$/$name$"
packageSummary in Docker := "$description$"
packageDescription := "$description$"
dockerExposedPorts := List(8080)
dockerBaseImage := "frolvlad/alpine-scala"
