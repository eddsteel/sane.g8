enablePlugins(JavaAppPackaging)
maintainer in Docker := "$maintname$ <$maintemail$>"
packageName in Docker := "$dhuser$/$name$"
packageSummary in Docker := "$desc$"
packageDescription := "$desc$"
dockerExposedPorts := List($port$)
dockerBaseImage := "frolvlad/alpine-scala"
dockerUpdateLatest := true
