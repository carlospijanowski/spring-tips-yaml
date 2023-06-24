package br.com.seteideias.springtipsyaml;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringTipsYamlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTipsYamlApplication.class, args);
        System.out.println("*************************************************");
    }

    @Bean
    ApplicationRunner applicationRunner(Environment environment) {
        return args -> {
            String mensagem = environment.getProperty("mensagem");
            System.out.println(mensagem);
        };
    }

}
