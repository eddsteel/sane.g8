enablePlugins(JavaAppPackaging)
maintainer in Docker := "$maintname$ <$maintemail$>"
packageName in Docker := "$dhuser$/$name$"
packageSummary in Docker := "$desc$"
packageDescription := "$desc$"
dockerExposedPorts := List(8080)
dockerBaseImage := "frolvlad/alpine-scala"
dockerUpdateLatest := true
