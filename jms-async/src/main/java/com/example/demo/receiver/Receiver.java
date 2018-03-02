package com.example.demo.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Component
public class Receiver implements MessageListener {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onMessage(Message message) {
        try {
            if (message instanceof TextMessage) {
                this.logger.info("Email received: " + ((TextMessage) message).getText());
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
