package nl.onebank.onebankhub.transfermanagement.consumers

import nl.onebank.dto.AccountDto
import nl.onebank.onebankhub.shared.GROUP_ID
import nl.onebank.onebankhub.shared.NEW_ACCOUNT_TOPIC
import nl.onebank.onebankhub.transfermanagement.service.AccountService
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
private class AccountConsumer(private val accountService: AccountService) {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @KafkaListener(topics = [NEW_ACCOUNT_TOPIC], groupId = GROUP_ID)
    fun createAccount(request: AccountDto) {
        accountService.createAccount(request)
        logger.info("Message received: [$request]")
    }
}