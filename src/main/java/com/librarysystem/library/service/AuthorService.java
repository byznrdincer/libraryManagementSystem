package com.librarysystem.library.service;

import com.librarysystem.library.dto.AuthorDTO;
import com.librarysystem.library.dto.AuthorSaveDTO;
import com.librarysystem.library.dto.AuthorUpdateDTO;

import java.util.List;


    public interface AuthorService {

        String addAuthor(AuthorSaveDTO authorSaveDTO);

        List<AuthorDTO> getAllAuthor();

        String updateAuthor(AuthorUpdateDTO authorUpdateDTO);

        String deleteAuthor(int id);
    }

