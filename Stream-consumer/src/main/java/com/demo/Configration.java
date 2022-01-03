package com.demo;

import java.util.function.Consumer;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configration {

	@Bean
	public Consumer<KStream<String, Movie>> movie2020() {
		return data -> data.foreach((key, movie) -> {
			System.out.println(movie.getName()+"  == "+movie.getYear());
		});
	}
}
