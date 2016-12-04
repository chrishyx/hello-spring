package com.chrishyx.hello.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

/**
 * @author huyaxin
 */
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> template;

    public void send() {
        ListenableFuture<SendResult<String, String>> future = this.template.send("test", "key", "value");
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                System.out.println("==Message Sent==");
            }

            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("==Message Send Failed==");
                System.out.println(throwable.getMessage());
            }
        });
    }
}
