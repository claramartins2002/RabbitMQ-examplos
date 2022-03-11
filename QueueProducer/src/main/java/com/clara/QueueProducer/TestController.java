package com.clara.QueueProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestController {

    @Autowired
    private QueueSender queueSender;

    @GetMapping
    public String send(){
        queueSender.send("hello world!!!!");
        return "ok. done";
    }

}