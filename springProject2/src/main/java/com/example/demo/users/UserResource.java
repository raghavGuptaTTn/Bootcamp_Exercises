package com.example.demo.users;

import com.example.demo.exception.UserNotFoundException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }


//    ==========================================================================

    /*

    // after implementing HATEOAS
    @GetMapping("/users/{id}")
    // EntityModel is a class wrapping an object along with some links -- simple.
    // WebMvcLinkBuilder is a class which helps to build links to spring mvc controllers/ methods
    public EntityModel<User> retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user == null)
            throw new UserNotFoundException("id - " + id);

        EntityModel<User> model = new EntityModel<>(user);

        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        // here we don't assign the url /users directly. Rather we make a link to the method.
        // because if some time in future we change the url, then we need to change this also.
        // here its a link to method, which will always work.
        // as hard coding is not good, so.... good luck.

        model.add(linkTo.withRel("all-users"));
        // here we give a name to a link to make the user understand what is this or other reason also.
        return model;
    }
     */





    // after implementing exceptions also...
    @GetMapping("/users/{id}")
    // throw exception when user not found
    // return 500 - internal server error by default which is better but wrong again.
    // server is fine, it was the request which was bad.
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user == null)
            throw new UserNotFoundException("id - " + id);
        return user;
    }




    /*
    @GetMapping("/users/{id}")
    // returns 200 OK even when the resource is not found. so, we correct it.
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        return user;
    }
     */


    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);

        // build the URi of the new user
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()       // get current request URI - /users
                .path("/{id}")              // append the id of the user
                .buildAndExpand(savedUser.getId())  // replace id with actual id of user
                .toUri();                   // generate the URI

        return ResponseEntity.created(location).build();    // return the URI with a status of CREATED.
    }

    /*
     @PostMapping("/users")
    public User createUser(@RequestBody User user){
        User savedUser = service.save(user);
        return savedUser;
    }
     */

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        User deletedUser = service.deleteById(id);

        // if user is not found, then send 404
        if(deletedUser==null)
            throw  new UserNotFoundException("id - "+id);


        // else return 200.

    }



    @GetMapping("/internationalization")
    public String helloWorldInternationalised(){
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
    }

    @GetMapping("/internationalization/q1b")
    public String helloWorldInternationalisedUsername(@RequestParam Object name){
        return messageSource.getMessage("good.morning.message", new Object[]{name}, LocaleContextHolder.getLocale());
    }
}
