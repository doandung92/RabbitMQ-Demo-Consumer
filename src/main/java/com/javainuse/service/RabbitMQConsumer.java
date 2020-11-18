package com.javainuse.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.javainuse.model.Employee;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${javainuse.rabbitmq.queue}")
	public void receivedMessage(Employee employee) {
		System.out.println("Received Message From RabbitMQ: " + employee);
	}
}
