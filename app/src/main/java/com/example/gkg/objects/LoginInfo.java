package com.example.gkg.objects;

import java.io.Serializable;

/**
 * Created by gkg on 26.02.15.
 */
public class LoginInfo implements Serializable {

    private String login;
    private String password;

    public String getLogin() {

        return this.login;

    }
    public void setLogin(String login) {

        this.login = login;

    }
    public String getPassword() {

        return this.password;

    }
    public void setPassword(String password) {

        this.password = password;

    }
    public boolean checkUser() {

        String trustedLogin = "admin";
        String trustedPassword = "123";

        if (this.login.equals(trustedLogin)
                && this.password.equals(trustedPassword)) {

            return true;

        }

        return false;
    }

}
