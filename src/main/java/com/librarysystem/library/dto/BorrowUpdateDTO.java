package com.librarysystem.library.dto;

public class BorrowUpdateDTO {

    private int borrowid; // ID'yi tutan alan
    private int book_id;
    private int user_id;
    private String borrowDate;  // Tarih formatı String veya LocalDate olabilir
    private String returnDate;  // Tarih formatı String veya LocalDate olabilir

    // Parametreli Constructor
    public BorrowUpdateDTO(int borrowid, int book_id, int user_id, String borrowDate, String returnDate) {
        this.borrowid = borrowid;
        this.book_id = book_id;
        this.user_id = user_id;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    // Parametresiz Constructor
    public BorrowUpdateDTO() {
    }

    // Getter ve Setter Metotları
    public int getBorrowid() {
        return borrowid;  // Bu metodu getId() yerine kullanıyoruz
    }

    public void setBorrowid(int borrowid) {
        this.borrowid = borrowid;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
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

    // toString Metodu (isteğe bağlı)
    @Override
    public String toString() {
        return "BorrowUpdateDTO{" +
                "borrowid=" + borrowid +
                ", book_id=" + book_id +
                ", user_id=" + user_id +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
