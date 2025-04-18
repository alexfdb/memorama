package com.quiz.model;

import java.util.Objects;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class User {

    private String name;
    private String password;

    /**
     * Constructor por defecto.
     */
    public User() {
    }

    /**
     * Constructor general.
     * 
     * @param nombre      nombre del usuario.
     * @param contrasenia contrasenia del usuario.
     */
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getName() + ", " + getPassword();
    }

}