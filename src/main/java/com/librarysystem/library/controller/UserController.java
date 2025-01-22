package com.librarysystem.library.controller;

import com.librarysystem.library.dto.UserDTO;
import com.librarysystem.library.dto.UserSaveDTO;
import com.librarysystem.library.dto.UserUpdateDTO;
import com.librarysystem.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserSaveDTO userSaveDTO) {
        String response = userService.addUser(userSaveDTO);
        return "User added successfully";
    }

    @GetMapping(path = "/getAllUsers")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping(path = "/update")
    public String updateUser(@RequestBody UserUpdateDTO userUpdateDTO) {
        return userService.updateUser(userUpdateDTO);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable(value = "id") int id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
