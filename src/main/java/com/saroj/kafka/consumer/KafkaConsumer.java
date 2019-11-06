package com.saroj.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.saroj.kafka.model.User;

@Service
public class KafkaConsumer {

/*	@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	@KafkaListener(topics = "Kafka_Example_json", groupId = "group_json", containerFactory = "KafkaListenerContainerFactory")
	public User consumeJson(@Payload User message) {
		System.out.println("Consumed JSON Message: " + message);
		
		return message;
	}*/

}
