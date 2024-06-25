package nl.onebank.dto

data class TransferDto (val senderIBAN:String, val receiverIBAN:String, val amount:Double)
{}