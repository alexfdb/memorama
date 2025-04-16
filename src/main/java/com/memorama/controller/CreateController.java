package com.memorama.controller;

import com.memorama.controller.screen.ScreenController;
import com.memorama.model.User;
import com.memorama.model.UserModel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class CreateController extends ScreenController {

    @FXML
    private TextField textFieldUser;
    @FXML
    private PasswordField passwordFieldPassword;
    @FXML
    private PasswordField passwordFieldRepeatPassword;
    @FXML
    private Text textMessage;
    @FXML
    private Button buttonAccept;
    @FXML
    private Button buttonStart;

    /**
     * Crea un nuevo usuario.
     */
    @FXML
    public void buttonAcceptClick() {
        if (!validateCredentials()) {
            textMessage.setText("Credenciales invalidas");
            return;
        }
        if (!passwordFieldPassword.getText().equals(passwordFieldRepeatPassword.getText())) {
            textMessage.setText("Las contraseñas deben coincidir");
            return;
        }
        User user = new User(textFieldUser.getText(), passwordFieldPassword.getText());
        UserModel userModel = new UserModel();
        if (userModel.createUser(user)) {
            textMessage.setText("Usuario creado con exito");
            return;
        }
        textMessage.setText("Usuario no pudo crearse");
    }

    /**
     * Cambia a la pantalla iniciar.
     */
    @FXML
    public void buttonStartClick() {
        startScreen(buttonStart);
    }

    /**
     * Valida las credenciales.
     * 
     * @return retorna true si estas son validas.
     */
    private boolean validateCredentials() {
        return (textFieldUser != null && textFieldUser.getText() != null && !textFieldUser.getText().isBlank() &&
                passwordFieldPassword != null && passwordFieldPassword.getText() != null
                && !passwordFieldPassword.getText().isBlank() &&
                passwordFieldRepeatPassword != null && passwordFieldRepeatPassword.getText() != null
                && !passwordFieldRepeatPassword.getText().isBlank());
    }

}