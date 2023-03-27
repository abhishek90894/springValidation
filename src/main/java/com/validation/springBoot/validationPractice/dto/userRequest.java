package com.validation.springBoot.validationPractice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class userRequest {

    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

}
