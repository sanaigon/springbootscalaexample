package com.example.springboot.scala.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class RestExampleController {

  @GetMapping(path = Array("/hello"))
  def helloWorld() = {
    "Hello World"
  }
}
