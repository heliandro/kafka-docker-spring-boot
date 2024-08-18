package com.example.kafka_demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/send")
    public String sendMessage(@RequestBody KafkaMessage message) {
        kafkaTemplate.send("teste", message.getKey(), message.getValue());
        return "Message sent successfully";
    }
}

record KafkaMessage(String key, String value) {}