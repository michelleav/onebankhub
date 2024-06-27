package nl.onebank.onebankhub.consumers

import nl.onebank.dto.TransferDto
import nl.onebank.onebankhub.*
import nl.onebank.onebankhub.service.TransferHistoryService
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
private class TransferConsumer(private val transferHistoryService: TransferHistoryService) {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @KafkaListener(topics = [TRANSFER_TOPIC], groupId = GROUP_ID)
    fun transfer(request: TransferDto) {
        transferHistoryService.createTransferHistory(request)
        logger.info("Message received: [$request]")
    }
}