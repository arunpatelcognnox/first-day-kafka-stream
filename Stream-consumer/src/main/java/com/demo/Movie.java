package com.demo;

import java.time.LocalDateTime;
import java.util.List;

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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getYoutubeTrailer() {
		return youtubeTrailer;
	}
	public void setYoutubeTrailer(String youtubeTrailer) {
		this.youtubeTrailer = youtubeTrailer;
	}
	public String getRunTime() {
		return runTime;
	}
	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public List<String> getDirectors() {
		return directors;
	}
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}
	public List<String> getWriters() {
		return writers;
	}
	public void setWriters(List<String> writers) {
		this.writers = writers;
	}
	public List<String> getStars() {
		return stars;
	}
	public void setStars(List<String> stars) {
		this.stars = stars;
	}
	public List<String> getOtherImages() {
		return otherImages;
	}
	public void setOtherImages(List<String> otherImages) {
		this.otherImages = otherImages;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public LocalDateTime getSaveTime() {
		return saveTime;
	}
	public void setSaveTime(LocalDateTime saveTime) {
		this.saveTime = saveTime;
	}

}
