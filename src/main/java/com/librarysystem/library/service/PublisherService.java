package com.librarysystem.library.service;

import com.librarysystem.library.dto.PublisherDTO;
import com.librarysystem.library.dto.PublisherSaveDTO;
import com.librarysystem.library.dto.PublisherUpdateDTO;

import java.util.List;

public interface PublisherService {
    String addPublisher(PublisherSaveDTO publisherSaveDTO);

    List<PublisherDTO> getAllPublisher();

    String updatePublisher(PublisherUpdateDTO publisherUpdateDTO);

    String deletePublisher(int id);
}
