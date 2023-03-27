package com.validation.springBoot.validationPractice.controller;

import com.validation.springBoot.validationPractice.dto.userRequest;
import com.validation.springBoot.validationPractice.entity.User;
import com.validation.springBoot.validationPractice.service.userService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
  private  userService userService;
    @PostMapping("/signUp")
    public ResponseEntity<User> saveUser(@RequestBody @Valid userRequest userRequest)
    {
         User user = userService.saveUser(userRequest);

         return new ResponseEntity<>(user, HttpStatus.CREATED);

    }
    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> getAllUser()
    {
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id)
    {
        User user = userService.getUserById(id);

        return new ResponseEntity<>(user,HttpStatus.OK);

    }


}
