package com.knoldus

import akka.actor.ActorSystem
import com.typesafe.config.Config

import scala.concurrent.ExecutionContext

class Handlers(conf: Config)(
  implicit actorSystem: ActorSystem,
  executionContext: ExecutionContext
) {

  lazy val fileUploadHandler: FileUploadHandler = new FileUploadHandler(conf.getConfig("file-upload"))

}
