package nl.onebank.dto

import nl.onebank.onebankhub.transfermanagement.entity.Account
import java.util.*

data class AccountDto (var firstName: String, var lastName: String, var address: String,
                       var iban: String, var currency: String, var balance: Double){
    fun toEntity(): Account {
        return Account(null, firstName, lastName, address, iban, currency, balance, Date())
    }
}


