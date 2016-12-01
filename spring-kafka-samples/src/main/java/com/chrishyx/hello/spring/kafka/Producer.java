package com.chrishyx.hello.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @author huyaxin
 */
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> template;

    public void send(){
        this.template.send("test", "key", "value");
    }
}
