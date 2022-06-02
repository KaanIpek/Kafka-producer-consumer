package com.kaan.kafkacons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaconsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaconsApplication.class, args);
	}

}
