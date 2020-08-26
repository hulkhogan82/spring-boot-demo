package com.example.springbootapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootapiApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringbootapiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootapiApplication.class, args);
	}

	/*@Bean
	CommandLineRunner initDatabase(final DataInitializer initializer) {
		return new CommandLineRunner() {
			@Override
			public void run(String... arg0) throws Exception {
				log.info(
						"\n ******** Initializing Data ***********");
				initializer.initData();
			}
		};
	}
	 */
}
