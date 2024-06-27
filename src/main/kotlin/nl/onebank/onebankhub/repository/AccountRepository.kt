package nl.onebank.onebankhub.repository

import nl.onebank.onebankhub.entity.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : JpaRepository<Account, Long> {
    fun getAccountByIBAN(iban: String)
}