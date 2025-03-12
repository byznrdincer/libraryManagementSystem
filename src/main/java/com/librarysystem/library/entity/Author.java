package com.librarysystem.library.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Setter
@Getter
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id", length = 11)
    private int authorid;

    @Column(name = "name", length = 45)
    private String name;

    @OneToMany(mappedBy = "author")
    private Set<Book> books;

    // Constructors
    public Author(int authorid, String name) {
        this.authorid = authorid;
        this.name = name;
    }

    public Author(String name) {
        this.name = name;
    }

    public Author() {
    }

}
