package com.scrf1.simplemessagequeue.services;

import com.scrf1.simplemessagequeue.entityDtos.UserDto;
import com.scrf1.simplemessagequeue.models.User;

import java.util.Optional;

public interface UserService {

    User createUser(UserDto userDto);
    Optional<User> getUserById(Long id);

}
