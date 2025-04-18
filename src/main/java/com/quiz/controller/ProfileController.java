package com.quiz.controller;

import com.quiz.controller.screen.ScreenController;
import com.quiz.model.User;
import com.quiz.model.UserModel;
import com.quiz.model.session.SessionModel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class ProfileController extends ScreenController {

    @FXML
    private Text textUser;
    @FXML
    private TextField textFieldUser;
    @FXML
    private PasswordField passwordFieldPassword;
    @FXML
    private Text textMessage;
    @FXML
    private Button buttonUpdate;
    @FXML
    private Button buttonClose;
    @FXML
    private Button buttonReturn;
    @FXML
    private Button buttonDelete;

    @FXML
    public void initialize() {
        if (SessionModel.getUser() != null) {
            textUser.setText(SessionModel.getUser().getName());
        } else {
            textUser.setText("Usuario no identificado");
        }
    }

    /**
     * Actualiza los datos del usuario.
     */
    @FXML
    public void buttonUpdateClick() {
        if (!validateCredentials()) {
            textMessage.setText("Credenciales invalidas");
            return;
        }
        UserModel userModel = new UserModel();
        User user = new User(textFieldUser.getText(), passwordFieldPassword.getText(),
                SessionModel.getUser().getAnswers(), SessionModel.getUser().getHits());
        userModel.updateUser(SessionModel.getUser(), user);
        textMessage.setText("Usuario actualizado");
    }

    /**
     * Cierra la sesion del usuario.
     */
    @FXML
    public void buttonCloseClick() {
        SessionModel.endSesion();
        startScreen(buttonClose);
    }

    /**
     * Vuelve a la pantalla de nivel.
     */
    @FXML
    public void buttonReturnClick() {
        levelScreen(buttonReturn);
    }

    /**
     * Elimina la cuenta del usuario.
     */
    public void buttonDeleteClick() {
        UserModel userModel = new UserModel();
        userModel.deleteUser(SessionModel.getUser());
        startScreen(buttonDelete);
    }

    /**
     * Valida las credenciales.
     * 
     * @return retorna true si estas son validas.
     */
    private boolean validateCredentials() {
        return (textFieldUser != null && textFieldUser.getText() != null && !textFieldUser.getText().isBlank() &&
                passwordFieldPassword != null && passwordFieldPassword.getText() != null
                && !passwordFieldPassword.getText().isBlank());
    }

}