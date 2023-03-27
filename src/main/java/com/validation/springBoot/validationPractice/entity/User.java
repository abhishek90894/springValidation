package com.validation.springBoot.validationPractice.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "user")
@Data
@RequiredArgsConstructor
public class User {
 @Id
 @GeneratedValue()
    private int id;

    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

}
