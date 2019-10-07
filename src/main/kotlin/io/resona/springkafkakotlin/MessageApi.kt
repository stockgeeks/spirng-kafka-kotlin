package io.resona.springkafkakotlin

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MessageApi(private val kotlinProducer: KotlinProducer) {
  @PostMapping("/message")
  fun publish(@RequestBody message: String) {
    kotlinProducer.send(message)
  }
}

