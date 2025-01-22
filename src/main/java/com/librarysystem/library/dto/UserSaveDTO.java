package com.librarysystem.library.dto;

public class UserSaveDTO {

    private String name;
    private String email;

    // Parametreli Constructor
    public UserSaveDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Parametresiz Constructor
    public UserSaveDTO() {
    }

    // Getter ve Setter metotları
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
        return "UserSaveDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
