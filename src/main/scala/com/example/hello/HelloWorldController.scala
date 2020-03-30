package com.example.hello

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class HelloWorldController extends Controller {

  get("/hi") { request: Request =>
    println(request)
    "Hello " + request.params.getOrElse("name", "unnamed")
  }

  post("/hi") { hiRequest: HiRequest =>
    "Hello " + hiRequest.name + " with id " + hiRequest.id
  }
}