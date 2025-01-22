package com.librarysystem.library.service.IMPL;

import com.librarysystem.library.dto.UserDTO;
import com.librarysystem.library.dto.UserSaveDTO;
import com.librarysystem.library.dto.UserUpdateDTO;
import com.librarysystem.library.entity.User;
import com.librarysystem.library.repo.UserRepo;
import com.librarysystem.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String addUser(UserSaveDTO userSaveDTO) {
        // UserSaveDTO'dan gelen name ve email bilgilerini al
        User user = new User(
                userSaveDTO.getName(),  // name alınıyor
                userSaveDTO.getEmail()   // email alınıyor
        );
        userRepo.save(user);  // User objesini kaydet
        return user.getName();  // Kullanıcının name'ini döndür
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepo.findAll();  // Tüm kullanıcıları çek
        List<UserDTO> userDTOList = new ArrayList<>();  // Kullanıcı bilgilerini DTO'ya dönüştür

        for (User user : users) {
            UserDTO userDTO = new UserDTO(
                    user.getUserid(),       // ID bilgisi
                    user.getName(),         // name bilgisi
                    user.getEmail()         // email bilgisi
            );
            userDTOList.add(userDTO);  // Listeye ekle
        }
        return userDTOList;  // Kullanıcı listesini döndür
    }

    @Override
    public String updateUser(UserUpdateDTO userUpdateDTO) {
        // Kullanıcıyı ID'ye göre bul
        if (userRepo.existsById(userUpdateDTO.getId())) {
            User user = userRepo.getById(userUpdateDTO.getId());
            // Kullanıcı bilgilerini güncelle
            user.setName(userUpdateDTO.getName());
            user.setEmail(userUpdateDTO.getEmail());
            userRepo.save(user);  // Güncellenmiş kullanıcıyı kaydet
            return user.getName();  // Güncellenmiş name'i döndür
        } else {
            System.out.println("User ID not found");  // Kullanıcı bulunamadı
        }
        return null;
    }

    @Override
    public String deleteUser(int id) {
        // Kullanıcıyı ID'ye göre sil
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
            return "User deleted successfully";  // Silme başarılı
        } else {
            System.out.println("ID not found");  // Kullanıcı bulunamadı
        }
        return null;
    }

    @Override
    public boolean validateUser(String email, String name) {
        // Email ve name bilgileriyle kullanıcıyı kontrol et
        Optional<User> userOpt = userRepo.findByEmailAndName(email, name);

        // Eğer kullanıcı varsa doğrulama başarılı, yoksa başarısız
        return userOpt.isPresent();
    }
}
