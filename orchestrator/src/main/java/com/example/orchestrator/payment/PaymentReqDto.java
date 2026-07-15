package com.example.orchestrator.payment;

import java.math.BigDecimal;

public class PaymentReqDto {

    private BigDecimal amount;
    private String currency;
    private String paymentMethod;

    public PaymentReqDto(BigDecimal amount, String currency, String paymentMethod) {
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "PaymentReqDto [amount=" + amount + ", currency=" + currency + ", paymentMethod=" + paymentMethod + "]";
    }

}
