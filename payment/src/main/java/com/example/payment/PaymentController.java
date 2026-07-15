package com.example.payment;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/payment")
public class PaymentController {

    @PostMapping()
    PaymentIntent createPayment(@RequestBody PaymentRequest paymentRequest) {
        PaymentIntent paymentIntent = new PaymentIntent();

        String id = "pi_" + UUID.randomUUID().toString().substring(0, 8);
        paymentIntent.setId(id);
        paymentIntent.setAmount(paymentRequest.getAmount());
        paymentIntent.setCurrency(paymentRequest.getCurrency());
        paymentIntent.setPaymentMethod(paymentRequest.getPaymentMethod());
        paymentIntent.setStatus("completed");

        return paymentIntent;
    }

}
