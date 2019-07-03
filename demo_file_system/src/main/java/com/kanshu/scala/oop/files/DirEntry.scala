package com.kanshu.scala.oop.files

abstract class DirEntry(val parentPath: String, val name: String) {

  def path: String = {
    val seperatorIfNecessary =
      if (Directory.ROOT_PATH.equals(parentPath)) ""
      else Directory.SEPARATOR

    parentPath + seperatorIfNecessary  + name
  }

  def asDirectory: Directory
  def asFile: File

  def isDirectory: Boolean
  def isFile: Boolean

  def getType: String
}
