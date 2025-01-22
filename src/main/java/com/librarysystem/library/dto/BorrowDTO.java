package com.librarysystem.library.dto;

import com.librarysystem.library.entity.Book;
import org.apache.catalina.User;

import java.time.LocalDate;

public class BorrowDTO {

    private int id;
    private Book book;
    private User user;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    // Parametreli Constructor
    public BorrowDTO(int id, Book book, User user, LocalDate borrowDate, LocalDate returnDate) {
        this.id = id;
        this.book = book;
        this.user = user;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    // Parametresiz Constructor
    public BorrowDTO(int id, Book book, com.librarysystem.library.entity.User user, LocalDate borrowDate, LocalDate returnDate) {
    }

    // Getter ve Setter Metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    // toString Metodu (isteğe bağlı)
    @Override
    public String toString() {
        return "BorrowDTO{" +
                "id=" + id +
                ", book=" + book +
                ", user=" + user +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                '}';
    }
}

