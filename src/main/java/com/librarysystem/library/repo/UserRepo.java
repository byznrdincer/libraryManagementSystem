package com.librarysystem.library.repo;

import com.librarysystem.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}

