package com.clara.QueueProducer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class QueueProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueueProducerApplication.class, args);
	}

}
