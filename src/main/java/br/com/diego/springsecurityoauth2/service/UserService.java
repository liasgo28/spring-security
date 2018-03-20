package br.com.diego.springsecurityoauth2.service;

import java.util.List;

import br.com.diego.springsecurityoauth2.model.User;


public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(User user);
}
