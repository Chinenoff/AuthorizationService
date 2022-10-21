package com.example.authorizationservice.repository;

import com.example.authorizationservice.Authorities;
import com.example.authorizationservice.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private final static Map<String, User> userMap = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {

        //test block
        userMap.put("john", new User("john", "qwerty", Arrays.asList(Authorities.READ, Authorities.WRITE)));
        userMap.put("neo", new User("neo", "matrix13", Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE)));
        //end test block

        List<Authorities> foundUserAuthoities = null;
        if (userMap.containsKey(user) && userMap.get(user).getPassword().equals(password)) {
            foundUserAuthoities = userMap.get(user).getAuthoritiesList();
        }
        return foundUserAuthoities;
    }
}
