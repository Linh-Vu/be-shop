package com.example.controller;

import com.example.dto.UserDto;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by linhv on 5/5/2017.
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody UserDto userDto){
        userService.createUser(userDto);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateUser(@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
                           @PathVariable("id") Long id) {
        userService.updateUser(phoneNumber, id);
    }
}
