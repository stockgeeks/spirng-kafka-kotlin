package io.resona.springkafkakotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka


@SpringBootApplication
@EnableKafka
class SpringKafkaKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringKafkaKotlinApplication>(*args)
}
