package com.example.authorizationservice.model;

import com.example.authorizationservice.Authorities;

import java.util.List;
import java.util.Objects;

public class User {
    private String login;

    private String password;
    private List<Authorities> authoritiesList;

    public User() {
    }

    public User(String login, String password) {

        this.login = login;
        this.password = password;
    }

    public User(String login, String password, List<Authorities> authoritiesList) {
        this.login = login;
        this.password = password;
        this.authoritiesList = authoritiesList;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getAuthoritiesList() {
        return authoritiesList;
    }

    public void setAuthoritiesList(List<Authorities> authoritiesList) {
        this.authoritiesList = authoritiesList;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", authoritiesList=" + authoritiesList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}
