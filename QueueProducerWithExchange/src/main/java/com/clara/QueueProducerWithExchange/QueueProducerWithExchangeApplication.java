package com.clara.QueueProducerWithExchange;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class QueueProducerWithExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueueProducerWithExchangeApplication.class, args);
	}

}
