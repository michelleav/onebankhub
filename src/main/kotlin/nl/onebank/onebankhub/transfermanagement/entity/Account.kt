package nl.onebank.onebankhub.transfermanagement.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.Date

@Entity
data class Account (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var firstName: String,
    var lastName: String,
    var address: String,
    var IBAN: String,
    var currency: String,
    var balance: Double,
    var creationDate: Date) {}