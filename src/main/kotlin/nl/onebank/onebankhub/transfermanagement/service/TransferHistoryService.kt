package nl.onebank.onebankhub.transfermanagement.service

import nl.onebank.dto.TransferDto
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class TransferHistoryService() {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    fun createTransferHistory(transferDto: TransferDto){
        // retrieve accounts
        // create transferHistory object
        // save transferHistory object
        logger.info("Saving data to transfer-history table")
    }
}