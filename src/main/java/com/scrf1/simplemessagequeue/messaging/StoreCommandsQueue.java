package com.scrf1.simplemessagequeue.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class StoreCommandsQueue {

    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload String fileBody) {
        
    }

}
