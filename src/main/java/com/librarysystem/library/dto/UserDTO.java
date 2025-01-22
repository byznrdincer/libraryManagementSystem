package com.librarysystem.library.dto;

public class UserDTO {

    private int userid;
    private String name;
    private String email;

    // Parametreli Constructor
    public UserDTO(int userid, String name, String email) {
        this.userid = userid;
        this.name = name;
        this.email = email;
    }

    // Parametresiz Constructor
    public UserDTO() {
    }

    // Getter ve Setter metotları
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
        return "UserDTO{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

