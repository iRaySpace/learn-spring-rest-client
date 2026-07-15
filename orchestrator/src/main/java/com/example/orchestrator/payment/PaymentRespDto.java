package com.example.orchestrator.payment;

import java.math.BigDecimal;

public class PaymentRespDto {

    private String id;
    private BigDecimal amount;
    private String currency;
    private String paymentMethod;
    private String status;

    public PaymentRespDto(String id, BigDecimal amount, String currency, String paymentMethod, String status) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public String getId() {
        return id;
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

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "PaymentRespDto [id=" + id + ", amount=" + amount + ", currency=" + currency + ", paymentMethod="
                + paymentMethod + ", status=" + status + "]";
    }

}