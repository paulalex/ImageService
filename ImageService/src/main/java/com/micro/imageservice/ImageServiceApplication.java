package com.micro.imageservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ImageServiceApplication
{
	public static void main(final String[] args)
	{
		SpringApplication.run(ImageServiceApplication.class, args);
	}
}
