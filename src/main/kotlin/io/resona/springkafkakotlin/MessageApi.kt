package io.resona.springkafkakotlin

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageApi(private val kotlinProducer: KotlinProducer) {
  @PostMapping("publish")
  fun publish(@RequestBody message: String) {
    kotlinProducer.send(message)
  }
}

