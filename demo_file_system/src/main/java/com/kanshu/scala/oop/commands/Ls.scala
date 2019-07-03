package com.kanshu.scala.oop.commands

import com.kanshu.scala.oop.files.DirEntry
import com.kanshu.scala.oop.filesystem.State

class Ls extends Command {

  override def apply(state: State): State = {
    val contents = state.wd.contents
    val niceOUtput = createNiceOutput(contents)
    state.setMessage(niceOUtput)
  }

  def createNiceOutput(contents: List[DirEntry]): String = {
    if (contents.isEmpty) ""
    else {
      val entry = contents.head
      entry.name +  "[" + entry.getType + "]" + "\n" + createNiceOutput(contents.tail)
    }
  }

}
