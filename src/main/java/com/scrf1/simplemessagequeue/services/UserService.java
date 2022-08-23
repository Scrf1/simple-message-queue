package com.scrf1.simplemessagequeue.services;

import com.scrf1.simplemessagequeue.models.User;

import java.util.Optional;

public interface UserService {

    User createUser(String firstName, String lastName, String phone, String email);
    Optional<User> getUserById(Long id);

}
