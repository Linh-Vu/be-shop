package com.example.service;

import com.example.repo.UserRepository;
import com.example.dto.UserDto;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by linhv on 5/5/2017.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getUsers() {
        List<User> users = userRepository.findAll();
        User userX = userRepository.findOne(1l);
        return users.stream().map(user -> {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setName(user.getName());
            userDto.setPassword(user.getPassword());
            return userDto;
        }).collect(Collectors.toList());
    }

    @Override
    public void createUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());

        userRepository.save(user);
    }

    @Override
    public void updateUser(String phoneNumber, Long id) {
        User user = userRepository.findOne(id);

        user.setPhoneNumber(phoneNumber);

        userRepository.save(user);
    }


}
