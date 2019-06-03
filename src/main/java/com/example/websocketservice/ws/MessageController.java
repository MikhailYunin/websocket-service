package com.example.websocketservice.ws;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class MessageController {

    @MessageMapping("/start/{uuid}")
    @SendTo({"/play/{uuid}"})
    public Message send(Message message, @DestinationVariable String uuid) throws Exception {
        return new Message(message.getAuthor(), message.getMessageText());
    }
}