package com.kanshu.scala.oop.commands
import com.kanshu.scala.oop.files.{DirEntry, Directory}
import com.kanshu.scala.oop.filesystem.State

class Mkdir(name: String) extends CreateEntry(name) {

  def createSpecificEntry(state: State): DirEntry =
    Directory.empty(state.wd.path, name)
}
