package com.scrf1.simplemessagequeue.services;

import com.scrf1.simplemessagequeue.entityDtos.UserDto;
import com.scrf1.simplemessagequeue.models.User;
import com.scrf1.simplemessagequeue.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPhone(userDto.getPhone());
        user.setEmail(userDto.getEmail());
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        if(id == null)
            return Optional.empty();
        return userRepository.findById(id);
    }
}
