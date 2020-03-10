package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

// this indicates that its a spring context file @SpringBootConfiguration
// enables auto config @EnableAutoConfiguration
// enables component scan of the specific package and registers the bean. in the group only.
// open this file and see.

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}


    @Bean
    public LocaleResolver localeResolver(){
        AcceptHeaderLocaleResolver locale_resolver = new AcceptHeaderLocaleResolver();
        locale_resolver.setDefaultLocale(Locale.US);
        return locale_resolver;
    }
}

