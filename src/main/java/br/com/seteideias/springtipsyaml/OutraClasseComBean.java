package br.com.seteideias.springtipsyaml;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OutraClasseComBean {

    @Bean
    void teste() {
        System.out.println("no teste");
    }

    @Bean
    void teste2() {
        System.out.println("no teste2");
    }

    @Bean
    void teste3() {
        try {
            Thread.sleep(10000);
            System.out.println("no teste3");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("no teste3");
    }

}
