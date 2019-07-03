package com.kanshu.scala.oop.commands
import com.kanshu.scala.oop.filesystem.State

class UnknownCommand extends Command {
  override def apply(state: State): State =
    state.setMessage("Command not found!")
}


