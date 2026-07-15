package com.example.orchestrator;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orchestrator.payment.PaymentRespDto;
import com.example.orchestrator.payment.PaymentService;

@RestController
@RequestMapping("/v1/orchestrator")
public class OrchestratorController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/order")
    Order createOrder() {
        PaymentRespDto paymentRespDto = paymentService.createPayment();
        System.out.println("paymentRespDto: " + paymentRespDto);

        String id = "ord_" + UUID.randomUUID().toString().substring(0, 8);
        Order order = new Order(id, paymentRespDto.getId(), "completed");

        return order;
    }

}
