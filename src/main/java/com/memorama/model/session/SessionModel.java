package com.memorama.model.session;

import com.memorama.model.User;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class SessionModel {

    private static User user;

    /**
     * Constructor privado.
     */
    private SessionModel() {
        throw new UnsupportedOperationException("Esta clase no puede ser instanciada");
    }

    /**
     * Inicia la sesion del usuario iniciado.
     * 
     * @param user usuario que se ha iniciado.
     */
    public static void startSesion(User user) {
        SessionModel.user = user;
    }

    /**
     * Cierra la sesion actual.
     */
    public static void endSesion() {
        SessionModel.user = null;
    }

    /**
     * Muestra el nombre del usuario en sesion.
     * 
     * @return retorna el nombre del usuario en sesion.
     */
    public static User getUser() {
        return (user != null) ? user : null;
    }

}