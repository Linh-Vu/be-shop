package com.example.service;

import com.example.dto.UserDto;

import java.util.List;

/**
 * Created by linhv on 5/5/2017.
 */
public interface UserService {
    List<UserDto> getUsers();
}
