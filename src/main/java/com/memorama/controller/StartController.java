package com.memorama.controller;

import com.memorama.controller.screen.ScreenController;
import com.memorama.model.User;
import com.memorama.model.UserModel;
import com.memorama.model.session.SessionModel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class StartController extends ScreenController {

    @FXML
    private TextField textFieldUser;
    @FXML
    private PasswordField passwordFieldPassword;
    @FXML
    private Text textMessage;
    @FXML
    private Button buttonStart;
    @FXML
    private Button buttonCreate;

    /**
     * Inicia la sesion del usuario.
     */
    @FXML
    public void buttonStartClick() {
        if (!validateCredentials()) {
            textMessage.setText("Credenciales invalidas");
            return;
        }
        User user = new User(textFieldUser.getText(), passwordFieldPassword.getText());
        UserModel userModel = new UserModel();
        if (userModel.readUser(user).isEmpty()) {
            textMessage.setText("Credenciales incorrectas");
            return;
        }
        textMessage.setText("");
        SessionModel.startSesion(user);
        levelScreen(buttonStart);
    }

    @FXML
    public void buttonCreateClick() {
        createScreen(buttonCreate);
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