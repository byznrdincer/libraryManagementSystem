package com.librarysystem.library.service.IMPL;

import com.librarysystem.library.entity.Book;
import com.librarysystem.library.entity.User;
import com.librarysystem.library.dto.BorrowDTO;
import com.librarysystem.library.dto.BorrowSaveDTO;
import com.librarysystem.library.dto.BorrowUpdateDTO;
import com.librarysystem.library.entity.Borrow;
import com.librarysystem.library.repo.BookRepo;
import com.librarysystem.library.repo.BorrowRepo;
import com.librarysystem.library.repo.UserRepo;
import com.librarysystem.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BorrowServiceIMPL implements BorrowService {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BorrowRepo borrowRepo;

    @Override
    public String addBorrow(BorrowSaveDTO borrowSaveDTO) {

        // Tarih formatını LocalDate'e dönüştürme
        LocalDate borrowDate = LocalDate.parse(borrowSaveDTO.getBorrowDate());  // String'den LocalDate'e dönüştürme
        LocalDate returnDate = LocalDate.parse(borrowSaveDTO.getReturnDate());

        // borrowSaveDTO'dan gelen book_id ve user_id ile ilgili book ve user objelerini alıyoruz
        Optional<Book> book = bookRepo.findById(borrowSaveDTO.getBook_id());
        Optional<User> user = userRepo.findById(borrowSaveDTO.getUser_id());

        if (book.isPresent() && user.isPresent()) {
            Borrow borrow = new Borrow(
                    book.get(),
                    user.get(),
                    borrowDate,
                    returnDate
            );
            borrowRepo.save(borrow);
            return "Borrow added successfully.";
        } else {
            return "Book or User not found!";
        }
    }

    @Override
    public List<BorrowDTO> getAllBorrow() {

        List<Borrow> getBorrow = borrowRepo.findAll();
        List<BorrowDTO> borrowDTOList = new ArrayList<>();

        for (Borrow borrow : getBorrow) {
            BorrowDTO borrowDTO = new BorrowDTO(
                    borrow.getId(),
                    borrow.getBook(),
                    borrow.getUser(),
                    borrow.getBorrowDate(),
                    borrow.getReturnDate()
            );
            borrowDTOList.add(borrowDTO);
        }
        return borrowDTOList;
    }

    @Override
    public String updateBorrow(BorrowUpdateDTO borrowUpdateDTO) {

        try {
            // borrowid kullanılıyor
            Optional<Borrow> optionalBorrow = borrowRepo.findById(borrowUpdateDTO.getBorrowid());

            if (optionalBorrow.isPresent()) {
                Borrow borrow = optionalBorrow.get();

                // Tarih formatını LocalDate'e dönüştürme
                borrow.setBook(bookRepo.findById(borrowUpdateDTO.getBook_id()).orElse(null));
                borrow.setUser(userRepo.findById(borrowUpdateDTO.getUser_id()).orElse(null));
                borrow.setBorrowDate(LocalDate.parse(borrowUpdateDTO.getBorrowDate()));  // String'den LocalDate'e dönüştürme
                borrow.setReturnDate(LocalDate.parse(borrowUpdateDTO.getReturnDate()));

                borrowRepo.save(borrow);

                return "Borrow updated successfully.";
            } else {
                return "Borrow ID Not Found";
            }
        } catch (Exception ex) {
            return "Error: " + ex.getMessage();
        }
    }
}
