package com.saroj.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saroj.kafka.producer.Sender;

@SpringBootApplication
public class SpringKafkaProducerConsumerExApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaProducerConsumerExApplication.class, args);
	}


    @Autowired
    private Sender sender;

    @Override
    public void run(String... strings) throws Exception {
        sender.send("Kafka Producer Consumer Example");
    }
}
