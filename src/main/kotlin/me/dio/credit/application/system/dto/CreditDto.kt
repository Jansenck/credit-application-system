package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Future
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import org.jetbrains.annotations.NotNull
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field: NotNull() val creditValue: BigDecimal,
    @field:Future val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int,
    @field: NotNull() val customerId: Long
) {
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )
}
