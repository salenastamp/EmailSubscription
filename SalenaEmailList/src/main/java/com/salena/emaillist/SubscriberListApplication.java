package com.salena.emaillist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salena.emaillist.subscriber.Subscriber;
import com.salena.emaillist.subscriber.SubscriberRepository;


@SpringBootApplication
public class SubscriberListApplication {
	private static final Logger log = LoggerFactory.getLogger(SubscriberListApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SubscriberListApplication.class, args);
		
	}
	@Bean
	public CommandLineRunner demo(SubscriberRepository repository) {
		return (args) -> {
		log.info("Subscribers found with FindAll():");
		log.info("----------------------------------");
		for (Subscriber subscriber : repository.findAll()) {
			log.info(subscriber.toString());
		}
		log.info("");
		
		repository.findById(7L)
			.ifPresent(subscriber -> {
				log.info("Subscriber found with findbyId(1L):");
				log.info("----------------------------------");
				log.info(subscriber.toString());
				log.info("");
				
			});
		log.info("Customer found with findByName('Wobbay'):");
		log.info("--------------------------------------------");
		repository.findByName("Wobbay").forEach(bauer -> {
			log.info(bauer.toString());
		});
		
		log.info("");
		
		log.info("Customer found with findByEmail('kassie@squiggle.com'):");
		log.info("--------------------------------------------");
		repository.findByEmail("kassie@squiggle.com").forEach(bauer -> {
			log.info(bauer.toString());
		
	});
		log.info("");
		
		log.info("Customer found with findByNameLike('R%'):");
		log.info("--------------------------------------------");
		repository.findByNameLike("R%").forEach(bauer -> {
			log.info(bauer.toString());
		});
		};
}}