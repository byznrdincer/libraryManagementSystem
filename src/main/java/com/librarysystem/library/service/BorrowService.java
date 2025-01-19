package com.librarysystem.library.service;

import com.librarysystem.library.dto.BorrowDTO;
import com.librarysystem.library.dto.BorrowSaveDTO;
import com.librarysystem.library.dto.BorrowUpdateDTO;

import java.util.List;

public interface BorrowService {
    String addBorrow(BorrowSaveDTO borrowSaveDTO);

    List<BorrowDTO> getAllBorrow();

    String updateBorrow(BorrowUpdateDTO borrowUpdateDTO);
}
