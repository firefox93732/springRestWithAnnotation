package com.shuai.demo.config;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration

public class ServiceConfig {
  @Bean
  Validator beanValidation() {
      return new LocalValidatorFactoryBean();
  }
}