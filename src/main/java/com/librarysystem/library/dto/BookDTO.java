package com.librarysystem.library.dto;

import com.librarysystem.library.entity.Author;
import com.librarysystem.library.entity.Publisher;

public class BookDTO {

    private int bookid;
    private String title;
    private Author author;
    private Publisher publisher;

    // Parametreli Constructor
    public BookDTO(int bookid, String title, Author author, Publisher publisher) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Parametresiz Constructor
    public BookDTO() {
    }

    // Getter ve Setter Metotları
    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    // toString Metodu (isteğe bağlı)
    @Override
    public String toString() {
        return "BookDTO{" +
                "bookid=" + bookid +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }
}

