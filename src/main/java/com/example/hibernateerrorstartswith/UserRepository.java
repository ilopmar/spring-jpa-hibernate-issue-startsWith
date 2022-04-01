package com.example.hibernateerrorstartswith;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

  List<UserEntity> findAllByNameStartingWith(String value);

}
