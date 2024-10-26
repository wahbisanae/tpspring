package com.example.tpspring.repository;

import com.example.tpspring.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
