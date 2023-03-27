package com.validation.springBoot.validationPractice.repository;

import com.validation.springBoot.validationPractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Integer> {


}
