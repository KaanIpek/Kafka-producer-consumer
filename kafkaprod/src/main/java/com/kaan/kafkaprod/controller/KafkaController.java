package com.kaan.kafkaprod.controller;

import com.kaan.kafkaprod.model.Message;
import com.kaan.kafkaprod.services.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    @PostMapping("/message")
    public void sendMessageToKafkaTopic(@RequestBody Message message) {
        this.kafkaProducer.sendMessage(message);
    }
}