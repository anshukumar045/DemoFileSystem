package com.kanshu.scala.oop.commands

import com.kanshu.scala.oop.filesystem.State

class Pwd extends Command{

  override def apply(state: State): State =
    state.setMessage(state.wd.path)

}
