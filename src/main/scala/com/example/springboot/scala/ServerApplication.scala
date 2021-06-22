package com.example.springboot.scala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ServerApplication {}

object ServerApplication extends App {
  SpringApplication.run(classOf[ServerApplication], args:_ *)
}