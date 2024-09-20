package com.msg.groupprojectmovies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.msg.GroupProjectMovies.Model"})  // Lägg till denna rad
public class GroupProjectMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupProjectMoviesApplication.class, args);
	}
}