package nl.onebank.onebankhub.transfermanagement.service

import nl.onebank.onebankhub.transfermanagement.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(val accountRepository: AccountRepository) {
}