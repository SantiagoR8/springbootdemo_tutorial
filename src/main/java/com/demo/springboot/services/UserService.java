package com.demo.springboot.services;

import com.demo.springboot.model.User;

public interface UserService extends CRUDService<User> {

    User findByUsername(String username);

}
