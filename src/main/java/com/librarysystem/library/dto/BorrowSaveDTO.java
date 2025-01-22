package com.librarysystem.library.dto;

public class BorrowSaveDTO {

    private String title;
    private int author_id;
    private int publisher_id;
    private int user_id;
    private String borrowDate;
    private String returnDate;
    private int book_id;  // Bu satırı ekledik

    // Getter ve Setter Metotları
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getBook_id() {  // Bu metodu ekledik
        return book_id;
    }

    public void setBook_id(int book_id) {  // Bu setter metodunu ekledik
        this.book_id = book_id;
    }
}
