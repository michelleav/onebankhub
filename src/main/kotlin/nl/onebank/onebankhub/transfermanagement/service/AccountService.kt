package nl.onebank.onebankhub.transfermanagement.service

import nl.onebank.dto.AccountDto
import nl.onebank.onebankhub.transfermanagement.entity.Account
import nl.onebank.onebankhub.transfermanagement.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(val accountRepository: AccountRepository) {
    fun createAccount(accountDto: AccountDto) : Account {
        var account = accountDto.toEntity()
        accountRepository.save(account)
        return account
    }

    fun retrieveAccountByIBAN(iban: String) : Account? {
        return accountRepository.getAccountByIBAN(iban)
    }
}