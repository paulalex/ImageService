package com.micro.imageservice.service;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerService
{
	@Autowired
	private final AmqpTemplate rabbitTemplate;

	@Autowired
	private final Exchange exchange;


	public CustomerService(final RabbitTemplate rabbitTemplate, final Exchange exchange)
	{
		this.rabbitTemplate = rabbitTemplate;
		this.exchange = exchange;
	}


	public void createCustomer()
	{
		// ... do some database stuff
		final String routingKey = "image.returned";
		final String message = "Image Returned From the Image Service";
		this.rabbitTemplate.convertAndSend(this.exchange.getName(), routingKey, message);
	}
}
