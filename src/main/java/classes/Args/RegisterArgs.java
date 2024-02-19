package classes.Args;

import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class RegisterArgs implements Serializable {
    private final String username;
    private final String email;
    private final String password;
    
    public RegisterArgs(
        String username,
        String email,
        String password
    ) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
    
}
