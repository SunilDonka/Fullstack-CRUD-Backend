package com.codewithsunil.Fullstack_backend.repository;

import com.codewithsunil.Fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {



}
