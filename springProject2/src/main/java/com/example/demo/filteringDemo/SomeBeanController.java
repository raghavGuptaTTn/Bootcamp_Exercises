package com.example.demo.filteringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SomeBeanController {

    @GetMapping("/filtering")
    public SomeBean getSomeBean(){
        return new SomeBean("raghav", "awesome", "intelligent");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> getListOfSomeBeans(){
        return Arrays.asList(
                    new SomeBean("raghabv", "good", "nad"),
                    new SomeBean("succcess", "goodnk", "money")
        );
    }
}
