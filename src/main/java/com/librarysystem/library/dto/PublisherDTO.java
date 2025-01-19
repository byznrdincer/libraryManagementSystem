package com.librarysystem.library.dto;

public class PublisherDTO {

    private int publisherid;
    private String name;

    // Parametreli Constructor
    public PublisherDTO(int publisherid, String name) {
        this.publisherid = publisherid;
        this.name = name;
    }

    // Parametresiz Constructor
    public PublisherDTO() {
    }

    // Getter ve Setter Metotları
    public int getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(int publisherid) {
        this.publisherid = publisherid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString Metodu (isteğe bağlı)
    @Override
    public String toString() {
        return "PublisherDTO{" +
                "publisherid=" + publisherid +
                ", name='" + name + '\'' +
                '}';
    }
}

