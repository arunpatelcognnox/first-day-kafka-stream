package com.demo;

import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configration {

	@Bean
	public Function<KStream<String, Movie>, KStream<String, Movie>> movieProcessing() {
		
		return data -> data.filter((key, movie) -> {
			if(movie.getYear() == null)
				System.out.println("No year date => "+ movie.getName());
			else if(movie.getYear().contains("2020"))
				System.out.println("This Is movie => "+ movie.getName());
			else
				System.out.println("Other movie => "+ movie.getName());
				
			return movie.getYear() !=null && movie.getYear().contains("2020");
		});
		
	}
	
}
