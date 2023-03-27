package com.validation.springBoot.validationPractice.service;

import com.validation.springBoot.validationPractice.Exception.userNotFoundException;
import com.validation.springBoot.validationPractice.dto.userRequest;
import com.validation.springBoot.validationPractice.entity.User;
import com.validation.springBoot.validationPractice.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {

    @Autowired
   private userRepository userRepository;

    public User saveUser(userRequest userRequest)
    {
        User user = User.build(0,userRequest.getName(),userRequest.getEmail(),userRequest.getGender()
                                 ,userRequest.getMobile(),userRequest.getAge(),userRequest.getNationality()
                     );
        return userRepository.save(user);

    }

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }

    public User getUserById(int id)
    {
        User user = userRepository.findById(id).orElseThrow(()-> new userNotFoundException("userNotFound,please provide valid userId"));
        return user;
    }


}
