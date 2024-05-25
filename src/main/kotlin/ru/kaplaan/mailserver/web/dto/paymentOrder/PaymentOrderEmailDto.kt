package ru.kaplaan.mailserver.web.dto.paymentOrder

import kotlinx.serialization.Serializable

@Serializable
data class PaymentOrderEmailDto(
    val payerInn: String,
    val payerKpp: String,
    val payerCompanyName: String,
    val payerCompanyAccountNumber: String,
    val payerBankBik: String,
    val payerBankAccountNumber: String,
    val payerBankName: String,
    val recipientInn: String,
    val recipientKpp: String,
    val recipientCompanyName: String,
    val recipientCompanyAccountNumber: String,
    val recipientBankBik: String,
    val recipientBankAccountNumber: String,
    val recipientBankName: String,
    val creationDate: String,
    val sum: Long,
    val purposeOfPayment: String,
    val email: String
)