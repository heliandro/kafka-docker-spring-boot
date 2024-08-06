package com.example.kafka_demo.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "teste", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}