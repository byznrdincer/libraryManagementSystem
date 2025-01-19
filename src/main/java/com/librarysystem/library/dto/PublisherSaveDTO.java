package com.librarysystem.library.dto;

public class PublisherSaveDTO {

    private String name;

    // Parametreli Constructor
    public PublisherSaveDTO(String name) {
        this.name = name;
    }

    // Parametresiz Constructor
    public PublisherSaveDTO() {
    }

    // Getter ve Setter Metotları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString Metodu (isteğe bağlı)
    @Override
    public String toString() {
        return "PublisherSaveDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}

