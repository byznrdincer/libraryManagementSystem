package com.librarysystem.library.entity;

import jakarta.persistence.*;


@Entity
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)



    private int authorid;




    private String name;


}
