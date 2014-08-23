package com.example.mouvies.rest;

import com.example.mouvies.core.domain.Cinema;
import com.example.mouvies.core.repositories.CinemasRepository;
import com.example.mouvies.core.services.CinemasService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by matteo on 23/08/14.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.example.mouvies.rest.controllers")
@EnableAutoConfiguration
public class Application {

  public CinemasRepository getCinemasRepository()  {
    return new CinemasRepository() {
      @Override
      public Cinema create(Cinema movie) throws Exception {
        movie.setId(12L);
        return movie;
      }
    };
  }

  @Bean
  public CinemasService getCinemasService() {
    return new CinemasService(getCinemasRepository());
  }

  public static void main(String[] args){
    SpringApplication.run(Application.class, args);
  }

}
