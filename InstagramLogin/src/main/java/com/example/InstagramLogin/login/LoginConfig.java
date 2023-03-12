package com.example.InstagramLogin.login;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LoginConfig {

    @Bean
    CommandLineRunner commandLineRunner(LoginRepository repository) {
        return args -> {
            Login hydro = new Login(
                    "Hydro",
                    "huy38725927"
            );

            Login alex = new Login(
                    "Alex",
                    "123456789"
            );

            repository.saveAll(
                    List.of(hydro, alex)
            );
        };
    }
}
