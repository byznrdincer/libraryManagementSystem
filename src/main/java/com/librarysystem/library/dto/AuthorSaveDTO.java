package com.librarysystem.library.dto;

public class AuthorSaveDTO {

    private String name;

    // Default Constructor (No-Args)
    public AuthorSaveDTO() {
    }

    // All-Args Constructor
    public AuthorSaveDTO(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AuthorSaveDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}


