package com.example.demo.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    // on the basis of URI
    @GetMapping("/v1/person")
    public PersonV1 personV1(){
        return new PersonV1("raghav gupta");
    }

    @GetMapping("/v2/person")
    public PersonV2 personV2(){
        return new PersonV2( new Name("raghav","gupta"));
    }

    // on the basis of Request Parameters
    @GetMapping(value="/person/param", params = "version=1")
    public PersonV1 paramV1(){
        return new PersonV1("raghav gupta");
    }

    @GetMapping(value="/person/param", params = "version=2")
    public PersonV2 paramV2(){
        return new PersonV2( new Name("raghav","gupta"));
    }

    // on the basis of header
    @GetMapping(value = "/person/header", headers="version=1")
    public PersonV1 headerV1(){
        return new PersonV1("raghav gupta");
    }

    @GetMapping(value = "/person/header", headers = "version=2")
    public PersonV2 headerV2(){
        return new PersonV2( new Name("raghav","gupta"));
    }

    // by using produces
    // Accept header versioning
    // MIME type versioning
    @GetMapping(value = "/person/produces", produces="application/vnd.company.app-V1+json")
    public PersonV1 producesV1(){
        return new PersonV1("raghav gupta");
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-V2+json")
    public PersonV2 producesV2(){
        return new PersonV2( new Name("raghav","gupta"));
    }

}
