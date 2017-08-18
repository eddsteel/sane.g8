name := "$name$"
description := "$desc$"
scalaVersion := "2.12.3"
organization := "$organization$"
version := "slice1"

licenses := List(("GPL version 3", url("https://www.gnu.org/licenses/gpl-3.0.en.html")))
homepage := Some(url("https://github.com/$ghuser$/$name$"))
developers := List(Developer("$ghuser$", "$maintname$", "$maintemail$", url("https://github.com/$ghuser$/$name$")))
scmInfo := Some(ScmInfo(url("https://github.com/$ghuser$/$name$"), "scm:git:https://github.com/$ghuser$/$name$.git"))

libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.0-MF"
libraryDependencies += "com.github.benhutchison" %% "mouse" % "0.10-MF"

Lint.settings
Flags.settings
