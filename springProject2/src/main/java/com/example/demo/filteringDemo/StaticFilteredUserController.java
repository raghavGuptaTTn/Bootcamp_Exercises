package com.example.demo.filteringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StaticFilteredUserController {

//    public List<StaticFilteredUser> users = Arrays.asList(
//            new StaticFilteredUser("raghav", "raghav@raghav.com", "123455"),
//            new StaticFilteredUser("vijeta", "vijeta@ttn", "778899")
//            );

    @PostMapping("/static-users")
    public StaticFilteredUser createNewUser(@RequestBody StaticFilteredUser user){
        System.out.println("called post");
        StaticFilteredUser newUser = new StaticFilteredUser(user.getUsername(), user.getEmail(),user.getPassword());
        System.out.println("new  user created");
        System.out.println(newUser.toString());
        return newUser;
    }

//    @GetMapping("/static-users")
//    public List<StaticFilteredUser> getAllUsers(){
//        return users;
//    }



}
