package com.scrf1.simplemessagequeue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@EntityScan(basePackages = {"com.scrf1.simplemessagequeue"})
@SpringBootApplication
public class SimpleMessageQueueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleMessageQueueApplication.class, args);
	}

}
