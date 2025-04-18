package com.quiz.model;

import java.util.Objects;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class User {

    private String name;
    private String password;
    private float easyAccuracy;
    private float mediumAccuracy;
    private float hardAccuracy;

    /**
     * Constructor por defecto.
     */
    public User() {
    }

    /**
     * Constructor solo con nombre y contrasenia.
     * @param name nombre del usuario.
     * @param password contrasenia del usuario.
     */
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * Constructor general.
     * 
     * @param name                nombre del usuario.
     * @param password            contrasenia del usuario.
     * @param easyAccuracy   porcentaje de acierto para nivel facil.
     * @param mediumAccuracy porcentaje de acierto para nivel medio.
     * @param hardAccuracy   porcentaje de acierto para nivel dificil.
     */
    public User(String name, String password, float easyAccuracy, float mediumAccuracy,
            float hardAccuracy) {
        this.name = name;
        this.password = password;
        this.easyAccuracy = easyAccuracy;
        this.mediumAccuracy = mediumAccuracy;
        this.hardAccuracy = hardAccuracy;
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

    public float getEasyAccuracy() {
        return this.easyAccuracy;
    }

    public void setEasyAccuracy(float easyAccuracy) {
        this.easyAccuracy = easyAccuracy;
    }

    public float getMediumAccuracy() {
        return this.mediumAccuracy;
    }

    public void setMediumAccuracy(float mediumAccuracy) {
        this.mediumAccuracy = mediumAccuracy;
    }

    public float getHardAccuracy() {
        return this.hardAccuracy;
    }

    public void setHardAccuracy(float hardAccuracy) {
        this.hardAccuracy = hardAccuracy;
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
        return "{" +
            " name='" + getName() + "'" +
            ", password='" + getPassword() + "'" +
            ", easyAccuracy='" + getEasyAccuracy() + "'" +
            ", mediumAccuracy='" + getMediumAccuracy() + "'" +
            ", hardAccuracy='" + getHardAccuracy() + "'" +
            "}";
    }

}