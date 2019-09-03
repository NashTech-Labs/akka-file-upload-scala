package com.knoldus

import akka.stream.scaladsl.Source
import akka.util.ByteString

class FileUploadHandlerSpec extends BaseSpec {

  val handler = new FileUploadHandler(conf.getConfig("file-upload"))

  "FileUploadHandler#uploadFile" should {

    "upload file without error" in {
      val fileSource: Source[FileSource, Any] =
        Source.single(FileSource("file-name", Source.single(ByteString("1"))))
      whenReady(handler.uploadFiles(fileSource)){
        _ shouldBe ()
      }
    }

  }

}
