import sbt.librarymanagement
name := "scafi-experiment"

version := "0.1"

scalaVersion := "3.3.3"
// build.sbt
val scafi_version = "1.3.0"

val scafi_core  =  "it.unibo.scafi" %% "scafi-core" % scafi_version
val scafi_simulator  =  "it.unibo.scafi" %% "scafi-simulator" % scafi_version
val scafi_simulator_gui =  "it.unibo.scafi" %% "simulator-gui-new" % scafi_version

libraryDependencies ++= Seq(
  scafi_simulator_gui.cross(CrossVersion.for3Use2_13),
  scafi_core.cross(CrossVersion.for3Use2_13),
  scafi_simulator.cross(CrossVersion.for3Use2_13)
)
fork := true
