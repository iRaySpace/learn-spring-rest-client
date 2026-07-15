package com.example.orchestrator;

public class Order {

    private String id;
    private String paymentId;
    private String status;

    public Order(String id, String paymentId, String status) {
        this.id = id;
        this.paymentId = paymentId;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
