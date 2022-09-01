package com.scrf1.simplemessagequeue.messaging;

import com.scrf1.simplemessagequeue.entityDtos.JuiceCommand;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandQueueSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public String send(JuiceCommand command) {
        rabbitTemplate.convertAndSend(this.queue.getName(), command.toString());
        return command.toString();
    }

}
