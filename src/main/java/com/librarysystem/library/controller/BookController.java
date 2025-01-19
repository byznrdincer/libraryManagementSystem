package com.librarysystem.library.controller;

import com.librarysystem.library.dto.BookDTO;
import com.librarysystem.library.dto.BookSaveDTO;
import com.librarysystem.library.dto.BookUpdateDTO;
import com.librarysystem.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(path = "/save")
    public String saveBook(@RequestBody BookSaveDTO bookSaveDTO)
    {
        String booktitle = bookService.addBook(bookSaveDTO);
        return  "Added Successfully";
    }



    @GetMapping(path = "/getAllBook")
    public List<BookDTO> getAllBook()
    {
        List<BookDTO> allBooks = bookService.getAllBook();
        return allBooks;
    }

    @PutMapping(path = "/update")
    public String updateBook(@RequestBody BookUpdateDTO bookUpdateDTO)
    {
        String bookname = bookService.updateBook(bookUpdateDTO);
        return  bookname;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteBook(@PathVariable(value = "id")int id)
    {
        String Bookname = bookService.deleteBook(id);
        return  "deleteddd";
    }



}
