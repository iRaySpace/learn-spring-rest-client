package com.example.payment;

import java.math.BigDecimal;

public class PaymentRequest {

    private BigDecimal amount;
    private String currency;
    private String paymentMethod;

    public PaymentRequest(BigDecimal amount, String currency, String paymentMethod) {
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

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "PaymentRequest [amount=" + amount + ", currency=" + currency + ", paymentMethod=" + paymentMethod + "]";
    }

}
