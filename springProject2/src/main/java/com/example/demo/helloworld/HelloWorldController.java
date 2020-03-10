package com.example.demo.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("hello world");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanWithPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }


    // after improving
    @GetMapping("/hello-world/internationalised")
    public String helloWorldInternationalised(){
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
    }

    // after improving
    @GetMapping("/hello-world/question1b")
    public String helloWorldInternationalised(@RequestParam String name){
        return messageSource.getMessage("good.morning.message", new String[]{name}, LocaleContextHolder.getLocale());
    }

    /* // before optimization
    @GetMapping("/hello-world/internationalised")
    public String helloWorldInternationalised(@RequestHeader(name = "Accept-Language", required = false) Locale locale){
        return messageSource.getMessage("good.morning.message", null, locale);
    }
     */


    /*
    // if u keep the name of function parameter diff than the path variable
    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanWithPathVariable(@PathVariable("name") String pathVar){
        return new HelloWorldBean(String.format("Hello world, %s", pathVar));
    }
    */
}
