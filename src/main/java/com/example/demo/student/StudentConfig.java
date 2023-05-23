package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(IStudentRepository repository) {
        return args -> {

            Student gavin = new Student(
                    "Gavin", "gavinloo@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21
            );

            Student alex = new Student(
                    "Alex", "alextan@gmail.com", LocalDate.of(2000, Month.APRIL, 16), 21
            );

            repository.saveAll(List.of(gavin, alex));
        };
    }
}
