package nl.onebank.onebankhub.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
data class TransferHistory (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long?,
        var senderFirstName: String,
        var senderLastName: String,
        var senderAddress: String,
        var senderIBAN: String,
        var receiverFirstName: String,
        var receiverLastName: String,
        var receiverAddress: String,
        var receiverIBAN: String,
        var amount: Double,
        var creationDate: Date,
){}