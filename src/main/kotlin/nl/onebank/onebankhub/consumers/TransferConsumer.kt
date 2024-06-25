package nl.onebank.onebankhub.consumers

import nl.onebank.dto.TransferDto
import nl.onebank.onebankhub.*
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
private class TransferConsumer {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @KafkaListener(topics = [TRANSFER_TOPIC], groupId = GROUP_ID)
    fun transfer(message: TransferDto) {
        logger.info("Message received: [$message]")
    }

}