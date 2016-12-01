package com.chrishyx.hello.spring.kafka;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author huyaxin
 */
@KafkaListener(topics = "test")
public class Consumer {

    @KafkaHandler
    public void handle(String msg) {
        System.out.println(msg);
    }

}
