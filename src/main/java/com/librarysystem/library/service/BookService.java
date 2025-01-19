package com.librarysystem.library.service;

import com.librarysystem.library.dto.BookDTO;
import com.librarysystem.library.dto.BookSaveDTO;
import com.librarysystem.library.dto.BookUpdateDTO;

import java.util.List;

public interface BookService {
    String addBook(BookSaveDTO bookSaveDTO);

    List<BookDTO> getAllBook();

    String updateBook(BookUpdateDTO bookUpdateDTO);

    String deleteBook(int id);
}
