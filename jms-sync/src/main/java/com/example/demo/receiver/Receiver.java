package com.example.demo.receiver;

import com.example.demo.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @JmsListener(destination = "testMail", containerFactory = "factory")
    public void receiveMessage(Email email) {
        this.logger.info(email.toString());
    }
}
