package com.medshoes.springbootapi.controller;

import com.medshoes.springbootapi.entity.User;
import com.medshoes.springbootapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService service;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users){
        return service.saveUsers(users);
    }
    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }
    @GetMapping("user/{id}")
    public User findById(@PathVariable int id){
        return service.getUserById(id);
    }
    @GetMapping("/user/{username}")
    public User findByUsername(@PathVariable String username){
        return service.getUserByUsername(username);
    }
    @GetMapping("/user/{name}")
    public User findByName(@PathVariable String name){
        return service.getUserByName(name);
    }

    @PutMapping("/user/update")
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }
    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable int id ){
        return service.deleteUser(id);
    }
}
