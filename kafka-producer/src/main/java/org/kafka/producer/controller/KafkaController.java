package org.kafka.producer.controller;

import org.kafka.producer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private KafkaTemplate<String, User> userkafkaTemplate;

	private static final String TOPIC = "Kafka_Example";
	
	private static final String TOPIC2 = "Kafka_Example_json";

	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {

		kafkaTemplate.send(TOPIC, name);

		return "Published successfully";
	}

	@PostMapping("/publish")
	public String post(@RequestBody User user) {

		userkafkaTemplate.send(TOPIC2,user);

		return "Published successfully";
	}
}
