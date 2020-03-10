//package com.example.demo.helloworld;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.support.ResourceBundleMessageSource;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
//import org.springframework.web.servlet.i18n.SessionLocaleResolver;
//
//import java.util.Locale;
//
//@SpringBootApplication
//public class HelloWorldApplication {
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = SpringApplication.run(HelloWorldApplication.class, args);
//    }
//
//    // after improving the code.
//    @Bean
//    public LocaleResolver localeResolver(){
//        AcceptHeaderLocaleResolver locale_resolver = new AcceptHeaderLocaleResolver();
//        locale_resolver.setDefaultLocale(Locale.US);
//        return locale_resolver;
//    }
//
//
//    // not required
////    @Bean
////    public ResourceBundleMessageSource bundleMessageSource(){
////        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
////        return messageSource;
////    }
//
//        /*
//        // before optimization
//        @Bean
//        public LocaleResolver localeResolver(){
//            SessionLocaleResolver locale_resolver = new SessionLocaleResolver();
//            locale_resolver.setDefaultLocale(Locale.US);
//            return locale_resolver;
//        }
//
//        @Bean
//        public ResourceBundleMessageSource bundleMessageSource(){
//            ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//            messageSource.setBasename("messages");
//            return messageSource;
//        }
//         */
//
//
//}
//
