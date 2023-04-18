package org.example;
import org.example.profile.DevProfile;
import org.example.profile.SystemProfile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConditionalSpringBootApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConditionalSpringBootApplication.class, args);
    }

}

