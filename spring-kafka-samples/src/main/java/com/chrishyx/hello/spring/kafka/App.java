package com.chrishyx.hello.spring.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author huyaxin
 */
@SpringBootApplication
public class App {

    @Bean
    public Producer getProducer() {
        return new Producer();
    }

    @Bean
    public Consumer getConsumer() {
        return new Consumer();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
        Producer producer = ctx.getBean(Producer.class);
        System.out.println(producer);
    }
}
