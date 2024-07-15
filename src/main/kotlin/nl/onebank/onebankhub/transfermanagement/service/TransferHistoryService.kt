package nl.onebank.onebankhub.transfermanagement.service

import jakarta.transaction.Transactional
import nl.onebank.dto.TransferDto
import nl.onebank.onebankhub.transfermanagement.entity.Account
import nl.onebank.onebankhub.transfermanagement.entity.TransferHistory
import nl.onebank.onebankhub.transfermanagement.repository.AccountRepository
import nl.onebank.onebankhub.transfermanagement.repository.TransferHistoryRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*

@Service
class TransferHistoryService(var transferHistoryRepository: TransferHistoryRepository,
    var accountService: AccountService, var accountRepository: AccountRepository) {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @Transactional
    fun createTransferHistory(transferDto: TransferDto) {
        var senderAcc = accountService.retrieveAccountByIBAN(transferDto.senderIBAN)
        var receiverAcc = accountService.retrieveAccountByIBAN(transferDto.receiverIBAN)

        createTransactionHistory(senderAcc, receiverAcc, transferDto)
        updateAccountBalances(senderAcc, receiverAcc, transferDto.amount)
    }

    private fun createTransactionHistory(senderAcc: Account, receiverAcc: Account, transferDto: TransferDto) {
        val transferHistory = TransferHistory(
            null, senderAcc.firstName, senderAcc.lastName, senderAcc.address,
            senderAcc.IBAN, receiverAcc.firstName, receiverAcc.lastName, receiverAcc.address, receiverAcc.IBAN,
            transferDto.amount, Date()
        )
        transferHistoryRepository.save(transferHistory)
        logger.info("Transfer history created")
    }

    private fun updateAccountBalances(senderAcc: Account, receiverAcc: Account, amount: Double) {
        senderAcc.balance -= amount
        accountRepository.save(senderAcc)
        receiverAcc.balance += amount
        accountRepository.save(receiverAcc)
        logger.info("Balances updated")
    }
}