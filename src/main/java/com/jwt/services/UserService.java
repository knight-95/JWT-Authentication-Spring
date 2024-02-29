package com.jwt.services;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.models.User;

@Service
public class UserService {
    private ArrayList<User> store = new ArrayList<>();

    public UserService() {

        store.add(new User(UUID.randomUUID().toString(), "Yash Gupta", "yashg@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Kirti Gupta", "kirtig@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Neelam Gupta", "neelamg@gmail.com"));
    
    }

    public ArrayList<User> getUsers(){
        return this.store;
    }

}
