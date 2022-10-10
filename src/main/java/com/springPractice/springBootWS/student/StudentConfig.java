package com.springPractice.springBootWS.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
class StudentConfig {

    private static final Logger log = LoggerFactory.getLogger(StudentConfig.class);

    @Bean
    CommandLineRunner initDatabase(StudentRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Student("Kleon", "dokle@gmail.com", LocalDate.of(2000, Month.APRIL, 5))));
            log.info("Preloading " + repository.save(new Student("Lajos", "lajcsi@gmail.com", LocalDate.of(1922, Month.APRIL, 12))));
        };
    }
}
