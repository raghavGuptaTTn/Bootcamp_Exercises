package com.example.demo.dynamicFiltering;

import com.example.demo.filteringDemo.SomeBean;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SomeBean1Controller {

    // filter field1 and field2
    @GetMapping("/dyna-filtering")
    public MappingJacksonValue getSomeBean(){
        SomeBean1 bean = new SomeBean1("raghav", "awesome", "intelligent");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");

        FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(bean);
        mapping.setFilters(filters);

        return mapping;
    }


    // filter field2 and field3
    @GetMapping("/dyna-filtering-list")
    public MappingJacksonValue getListOfSomeBeans(){

        List<SomeBean1> list = Arrays.asList(
                new SomeBean1("raghav", "good", "bad"),
                new SomeBean1("succcess", "goodnt", "honey")
        );

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");

        FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(list);
        mapping.setFilters(filters);

        return mapping;
    }
}