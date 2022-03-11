package com.clara.QueueProducerWithExchange;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestController {

    public TestController(AmqpTemplate queueSender) {
        this.queueSender = queueSender;
    }

    private final AmqpTemplate queueSender;

    @GetMapping
    public String send(){
        queueSender.convertAndSend("exchange-test", "rounting-key-example", "hello world with exchanges!!!");
        return "ok. done";
    }

}