package com.example.kafka_demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {


    @KafkaListener(topics = "geek1", groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(String.format("Consuming the message from geek1 topic:: %s", msg));
    }

}
