package com.andronvd.springBootFirstLesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.andronvd.springBootFirstLesson.persistence.repo")
@EntityScan("com.andronvd.springBootFirstLesson.persistence.model")
@SpringBootApplication
public class SpringBootFirstLessonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstLessonApplication.class, args);
	}

}

