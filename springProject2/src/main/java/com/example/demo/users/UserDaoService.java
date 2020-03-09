package com.example.demo.users;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    // we make them static, otherwise we need to make beans
    // by default it searches for beans inside a bean.
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;

    static{
        users.add(new User(++userCount, "adam", new Date()));
        users.add(new User(++userCount, "shivam", new Date()));
        users.add(new User(++userCount, "raghav", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        for(User user : users){
            if(user.getId().intValue() == id){
                return user;
            }
        }
        return null;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User deleteById(int id){
        Iterator<User> it = users.iterator();

        while(it.hasNext()){
            User user = it.next();

            if(id == user.getId()){
                it.remove();
                return user;
            }
        }
        return null;
    }

}
