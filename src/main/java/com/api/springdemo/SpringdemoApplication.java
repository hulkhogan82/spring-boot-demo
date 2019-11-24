package com.api.springdemo;

import com.api.springdemo.config.DataInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdemoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

	@Bean
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


}
