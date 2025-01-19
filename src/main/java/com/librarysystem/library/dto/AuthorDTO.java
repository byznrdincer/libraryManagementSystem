package com.librarysystem.library.dto;

public class AuthorDTO {

    private int authorid;
    private String name;

    // Default Constructor (No-Args)
    public AuthorDTO() {
    }

    // All-Args Constructor
    public AuthorDTO(int authorid, String name) {
        this.authorid = authorid;
        this.name = name;
    }

    // Getter for authorid
    public int getAuthorid() {
        return authorid;
    }

    // Setter for authorid
    public void setAuthorid(int authorid) {
        this.authorid = authorid;
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
        return "AuthorDTO{" +
                "authorid=" + authorid +
                ", name='" + name + '\'' +
                '}';
    }
}



