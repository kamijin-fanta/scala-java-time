import ReleaseTransformations._

releaseCrossBuild := true // true if you cross-build the project for multiple Scala versions
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  // For non cross-build projects, use releaseStepCommand("publishSigned")
  releaseStepCommandAndRemaining("+publishSigned"),
  setNextVersion,
  commitNextVersion,
  releaseStepCommand("sonatypeReleaseAll"),
  pushChanges
)

homepage := Some(url("https://github.com/kamijin-fanta/scala-java-time"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/kamijin-fanta/scala-java-time"),
    "scm:git@github.com:kamijin-fanta/scala-java-time.git"
  )
)
developers := List(
  Developer(
    id="kamijin_fanta",
    name="kamijin_fanta",
    email="kamijin@live.jp",
    url=url("https://github.com/kamijin-fanta")
  )
)
