package com.demo;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Movie {

	private String id;
	private String name;
	private String year;
	private String image;
	private String youtubeTrailer;
	private String runTime;
	private String imdbRating;
	private String description;
	private List<String> genres;
	private List<String> directors;
	private List<String> writers;
	private List<String> stars;
	private List<String> otherImages;
	private String story;
	private LocalDateTime saveTime;
	
}
