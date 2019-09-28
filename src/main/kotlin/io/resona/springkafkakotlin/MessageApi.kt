package io.resona.springkafkakotlin

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class MessageApi(private val kotlinProducer: KotlinProducer) {
  val counter = AtomicLong()

  @PostMapping("publish")
  fun publish(@RequestBody message: String) {
    kotlinProducer.send(message)
  }

}

