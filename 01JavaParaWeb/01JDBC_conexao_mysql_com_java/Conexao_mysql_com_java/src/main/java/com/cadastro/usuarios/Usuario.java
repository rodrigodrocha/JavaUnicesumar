package com.cadastro.usuarios;

public class Usuario {
    private int id;
    private String name;
    private String email;
    private String password;

    public Usuario(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }
    // Get e Set do ID:
    public int getId() {return id;}
    public void setId(int id) {
        this.id = id;
    }
    // Get e Set do Name:
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    // Get e Set do Email:
    public String getEmail() {return email;}
    public void setEmail(String email) {
        this.email = email;
    }
    // Get e Set do Password:
    public String getPassword() {return password;}
    public void setPassword(String password) {
        this.password = password;
    }
}
