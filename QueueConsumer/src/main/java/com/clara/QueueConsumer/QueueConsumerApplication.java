package com.clara.QueueConsumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class QueueConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueueConsumerApplication.class, args);
	}

}
