/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.Args;

import java.io.Serializable;

/**
 *
 * @author Diego
 */
public class LoginArgs implements Serializable {
    private final String username;
    private final String password;

    public LoginArgs(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}
