package com.example.demo.service;

import com.example.demo.domain.UserEntity;
import com.example.demo.dto.JoinDto;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
    private final UserRepository userRepository;
    public JoinService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public void joinProcess(JoinDto joinDto){
        String username = joinDto.getUsername();
        String password = joinDto.getPassword();

        Boolean isExist = userRepository.existsByUsername(username);

        if(isExist){
            return;
        }

        UserEntity data = new UserEntity();

        data.setUsername(username);
        data.setPassword(password);
        data.setRole("ROLE_ADMIN");

        userRepository.save(data);
    }
}
