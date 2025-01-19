package com.librarysystem.library.repo;

import com.librarysystem.library.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepo extends JpaRepository<Borrow,Integer > {
}