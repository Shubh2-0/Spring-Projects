package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class Config {
    
    @Bean
    public Address getAddress() {
	return new Address();
    }
    
    

}
