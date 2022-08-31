package com.scrf1.simplemessagequeue.messaging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class SenderConfigs {

    @Value("${queue.name}")
    private String message;

    @Bean
    public Queue queue() {
        return new Queue(message, true);
    }

}
