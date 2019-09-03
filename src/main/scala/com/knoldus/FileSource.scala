package com.knoldus

import akka.stream.scaladsl.Source
import akka.util.ByteString

case class FileSource(fileName: String, source: Source[ByteString, Any])
