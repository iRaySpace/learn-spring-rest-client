package com.example.orchestrator.payment;

import java.math.BigDecimal;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PaymentService {

    private RestClient restClient = RestClient.create("http://localhost:8090");

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
