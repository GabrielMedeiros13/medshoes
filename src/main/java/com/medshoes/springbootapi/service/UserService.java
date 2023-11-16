package com.medshoes.springbootapi.service;

import com.medshoes.springbootapi.entity.User;
import com.medshoes.springbootapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository repository;


    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users){
        return repository.saveAll(users);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

    public User getUserByUsername(String username){
        return repository.findByName(username);
    }

    public User getUserByName(String name){
        return repository.findByName(name);
    }

    public String deleteUser(int id){
        repository.deleteById(id);
        return "O Usuario de id" + id + "foi removido com sucesso";
    }

    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setPassword(user.getPassword());
        existingUser.setUsername(user.getUsername());

        return repository.save(existingUser);
    }
}
