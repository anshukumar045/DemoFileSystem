package com.kanshu.scala.oop.files

import com.kanshu.scala.oop.filesystem.FileSystemException

class File(override val parentPath: String, override val name: String,val contents: String)
extends DirEntry(parentPath, name) {

  def asDirectory: Directory = throw new FileSystemException("File Cannot be conrverted to a directory!")
  def asFile: File = this

  def isDirectory: Boolean = false
  def isFile: Boolean = true
  def getType: String = "File"
  def setContents(newContents: String): File =
    new File(parentPath, name, newContents)

  def appendContents(newContents: String): File =
    setContents(contents + "\n" + newContents)
}

object File {
  def empty(parentPath: String, name: String): File = new File(parentPath,name,"")
}
