package com.example.orchestrator.payment;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PaymentService {

    private RestClient restClient;

    public PaymentService(@Value("${payment.service.url}") String paymentServiceUrl) {
        restClient = RestClient.create(paymentServiceUrl);
    }

    public PaymentRespDto createPayment() {
        PaymentReqDto paymentReqDto = new PaymentReqDto(
            new BigDecimal("100.00"),
            "usd",
            "visa_credit_card");

        PaymentRespDto paymentRespDto = restClient.post()
            .uri("/v1/payment")
            .contentType(MediaType.APPLICATION_JSON)
            .body(paymentReqDto)
            .retrieve()
            .body(PaymentRespDto.class);

        return paymentRespDto;
    }

}
