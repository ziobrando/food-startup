package it.avanscoperta.foodstartup.config;

import org.axonframework.spring.saga.SpringResourceInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfiguration {

    @Bean
    public SpringResourceInjector springResourceInjector() {
        return new SpringResourceInjector();
    }
}
