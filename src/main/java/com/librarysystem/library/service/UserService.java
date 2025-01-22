package com.librarysystem.library.service;

import com.librarysystem.library.dto.UserDTO;
import com.librarysystem.library.dto.UserSaveDTO;
import com.librarysystem.library.dto.UserUpdateDTO;

import java.util.List;

public interface UserService {

    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUsers();

    String updateUser(UserUpdateDTO userUpdateDTO);

    String deleteUser(int userId);
}

