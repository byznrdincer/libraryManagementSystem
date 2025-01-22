package com.librarysystem.library.dto;

public class BorrowUpdateDTO {

    private int borrowid;
    private String title;
    private int author_id;
    private int publisher_id;

    // Parametreli Constructor
    public BorrowUpdateDTO(int borrowid, String title, int author_id, int publisher_id) {
        this.borrowid = borrowid;
        this.title = title;
        this.author_id = author_id;
        this.publisher_id = publisher_id;
    }

    // Parametresiz Constructor
    public BorrowUpdateDTO() {
    }

    // Getter ve Setter Metotları
    public int getBorrowid() {
        return borrowid;
    }

    public void setBorrowid(int borrowid) {
        this.borrowid = borrowid;
    }

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

    // toString Metodu (isteğe bağlı)
    @Override
    public String toString() {
        return "BorrowUpdateDTO{" +
                "borrowid=" + borrowid +
                ", title='" + title + '\'' +
                ", author_id=" + author_id +
                ", publisher_id=" + publisher_id +
                '}';
    }
}
