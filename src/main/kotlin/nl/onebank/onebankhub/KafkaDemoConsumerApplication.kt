package nl.onebank.onebankhub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaDemoConsumerApplication

fun main(args: Array<String>) {
	runApplication<KafkaDemoConsumerApplication>(*args)
}
