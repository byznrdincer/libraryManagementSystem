package com.librarysystem.library.repo;

import com.librarysystem.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer > {
}
