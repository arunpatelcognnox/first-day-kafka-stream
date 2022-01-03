package com.demo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/publish")
@AllArgsConstructor
public class Controller {

	private final String KAFKA_TOPIC = "movie";
	private RestTemplate restTemplate;
	private KafkaTemplate<String, Movie> kafkaTemplate;
	
	@GetMapping("/{name}")
	public String getByMovieName(@PathVariable String name) {
		
		Movie[] movies = restTemplate.getForEntity("https://moviepur-api.herokuapp.com/imdb/search/"+name, Movie[].class).getBody();
		System.out.println(movies.length);
		
		for(int i=0; i<movies.length; i++ )
			kafkaTemplate.send(KAFKA_TOPIC, movies[i]);
		
		return "successfull produced the message";
	}
	
	
}
