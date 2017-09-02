package com.daniel;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	
//	private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
    
    /*
    @Bean
	public CommandLineRunner demo(TestScoreRepository repository) {
		return (args) -> {
			// save a couple of TestScores
			repository.save(new TestScore("Jack", "Bauer", 98));
			repository.save(new TestScore("Chloe", "O'Brian", 85));
			repository.save(new TestScore("Kim", "Bauer", 100));
			repository.save(new TestScore("David", "Palmer", 50));
			repository.save(new TestScore("Michelle", "Dessler", 1));

			// fetch all TestScores
			log.info("TestScores found with findAll():");
			log.info("-------------------------------");
			for (TestScore TestScore : repository.findAll()) {
				log.info(TestScore.toString());
			}
			log.info("");

			// fetch an individual TestScore by ID
			TestScore TestScore = repository.findOne(1L);
			log.info("TestScore found with findOne(1L):");
			log.info("--------------------------------");
			log.info(TestScore.toString());
			log.info("");
			
			// fetch TestScores by first name
			log.info("TestScore found with findByFirstName('David'):");
			log.info("--------------------------------------------");
			for (TestScore david : repository.findByFirstName("David")) {
				log.info(david.toString());
			}
			log.info("");

			// fetch TestScores by last name
			log.info("TestScore found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (TestScore bauer : repository.findByLastName("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");
			
			// fetch TestScores by score
			log.info("TestScore found with findByScore('Bauer'):");
			log.info("--------------------------------------------");
			for (TestScore bauer : repository.findByLastName("Bauer")) {
				log.info(bauer.toString());
			}
			log.info("");
		};
	}
	*/
}