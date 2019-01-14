package com.micro.imageservice.configuration;


import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.micro.imageservice.service.CustomerService;


@Configuration
public class EventProducerConfiguration
{
	@Bean
	public Exchange eventExchange()
	{
		return new TopicExchange("eventExchange");
	}


	@Bean
	public CustomerService customerService(final RabbitTemplate rabbitTemplate)
	{
		return new CustomerService(rabbitTemplate, eventExchange());
	}
}
