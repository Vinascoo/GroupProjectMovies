package com.msg.groupprojectmovies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

// Commit 2 (Siyar): Lägger till entity scan för att inkludera filmmodeller.
// Detta säkerställer att JPA hittar rätt entiteter för databasanrop.
@EntityScan(basePackages = {"com.msg.GroupProjectMovies.Model"})

public class GroupProjectMoviesApplication {

	public static void main(String[] args) {

		// Commit 3 (Siyar): Startar Spring Boot-applikationen, vilket initierar alla konfigurationer och startar webbservern.
		SpringApplication.run(GroupProjectMoviesApplication.class, args);
	}
}