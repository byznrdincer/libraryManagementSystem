package com.librarysystem.library.dto;

public class UserUpdateDTO {

    private int id;        // Kullanıcı ID'si
    private String name;   // Kullanıcı adı
    private String email;  // Kullanıcı e-posta adresi

    // Parametreli Constructor
    public UserUpdateDTO(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Parametresiz Constructor
    public UserUpdateDTO() {
    }

    // Getter ve Setter metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString metodu (isteğe bağlı)
    @Override
    public String toString() {
        return "UserUpdateDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
