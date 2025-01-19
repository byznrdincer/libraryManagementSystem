package com.librarysystem.library.repo;


import com.librarysystem.library.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Integer > {
    }

