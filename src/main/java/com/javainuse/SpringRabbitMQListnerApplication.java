package com.javainuse;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRabbitMQListnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitMQListnerApplication.class, args);
	}

	@Bean
	MessageConverter messageConverter(){
		return new Jackson2JsonMessageConverter();
	}
}
