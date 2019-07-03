package com.kanshu.scala.oop.commands

import com.kanshu.scala.oop.files.{DirEntry, File}
import com.kanshu.scala.oop.filesystem.State

class Touch(name: String) extends CreateEntry(name) {

  def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)

}
