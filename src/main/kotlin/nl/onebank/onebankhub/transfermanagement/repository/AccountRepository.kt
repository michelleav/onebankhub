package nl.onebank.onebankhub.transfermanagement.repository

import nl.onebank.onebankhub.transfermanagement.entity.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : JpaRepository<Account, Long> {
    fun getAccountByIBAN(iban: String)
}