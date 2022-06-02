package com.kaan.kafkaprod.services;

import com.kaan.kafkaprod.model.Message;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private static final String TOPIC = "test";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Message message) {
        System.out.println("Producing message: " + message);
        this.kafkaTemplate.send(TOPIC, message.toString());
    }
}