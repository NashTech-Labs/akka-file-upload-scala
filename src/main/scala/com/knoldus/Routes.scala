package com.knoldus

import akka.http.scaladsl.server.Route

class Routes(handlers: Handlers) {

  private val fileUploadRoute: FileUploadRoute = new FileUploadRoute(handlers.fileUploadHandler)

  lazy val routes: Route = fileUploadRoute.route
}
