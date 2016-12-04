package com.chrishyx.hello.spring.kafka;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * @author huyaxin
 */
@KafkaListener(topics = "test")
public class Consumer {

    @KafkaHandler
    public void handle(@Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key, @Payload String value) {
        System.out.println("==Message Received==");
        System.out.println("Key: " + key + ", Value: " + value);
    }

}
