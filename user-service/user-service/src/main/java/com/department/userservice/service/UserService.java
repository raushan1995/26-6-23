package com.department.userservice.service;

import com.department.userservice.ResponseDto;
import com.department.userservice.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
