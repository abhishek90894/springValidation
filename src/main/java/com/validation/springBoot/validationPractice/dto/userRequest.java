package com.validation.springBoot.validationPractice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class userRequest {
    @NotNull(message = "user name should not be null")
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

}
