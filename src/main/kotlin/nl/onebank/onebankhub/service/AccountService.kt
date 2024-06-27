package nl.onebank.onebankhub.service

import nl.onebank.onebankhub.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(val accountRepository: AccountRepository) {
}