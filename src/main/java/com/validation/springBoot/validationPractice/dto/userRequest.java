package com.validation.springBoot.validationPractice.dto;

import jakarta.validation.constraints.*;
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
    @Email(message = "invalid email address")
    private String email;
    @Pattern(regexp ="^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",message = "invalid mobile number")
    private String mobile;
    private String gender;
    @Min(value=18,message = "minimum age should be 18")
    @Max(value =60, message = "maximum age should be 60")
    private int age;
    @NotBlank
    private String nationality;

}
