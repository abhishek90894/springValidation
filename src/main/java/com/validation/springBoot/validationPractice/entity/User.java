package com.validation.springBoot.validationPractice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {
 @Id
 @GeneratedValue
    private int id;

    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

}
