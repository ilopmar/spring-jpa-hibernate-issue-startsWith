package com.example.hibernateerrorstartswith;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {

  @Autowired
  UserRepository userRepository;

  @BeforeEach
  void setup() {
    userRepository.save(new UserEntity("John"));
    userRepository.save(new UserEntity("Jane"));
    userRepository.save(new UserEntity("Peter"));
  }

  @AfterEach
  void cleanup() {
    userRepository.deleteAll();
  }

  @Test
  void testStartsWith1() {
    List<UserEntity> users = userRepository.findAllByNameStartingWith("J");

    Assertions.assertEquals(2, users.size());
  }

  @Test
  void testStartsWith2() {
    List<UserEntity> users = userRepository.findAllByNameStartingWith("J");

    Assertions.assertEquals(2, users.size());
  }

}
