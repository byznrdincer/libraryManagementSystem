package com.librarysystem.library.repo;

import com.librarysystem.library.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher,Integer > {
}
