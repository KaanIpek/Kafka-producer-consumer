package com.kaan.kafkaprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaprodApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaprodApplication.class, args);
	}

}
