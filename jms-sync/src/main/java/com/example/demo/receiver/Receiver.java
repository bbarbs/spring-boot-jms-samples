package com.example.demo.receiver;

import com.example.demo.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Component
public class Receiver {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @JmsListener(destination = "testMail", containerFactory = "factory")
    public void receiveMessage(Message message) {
        try {
            this.logger.info("Email received: " + ((TextMessage) message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
