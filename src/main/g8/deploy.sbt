enablePlugins(JavaAppPackaging)
maintainer in Docker := "$maintainer$"
packageSummary in Docker := "$description$"
packageDescription := "$description$"
dockerExposedPorts := List(8080)
