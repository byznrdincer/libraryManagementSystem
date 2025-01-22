package com.librarysystem.library.repo;

import com.librarysystem.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {

    // Email ve Name ile kullanıcıyı bulmak için yeni bir metod ekliyoruz
    Optional<User> findByEmailAndName(String email, String name);
}
