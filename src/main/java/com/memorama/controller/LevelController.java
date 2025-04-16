package com.memorama.controller;

import com.memorama.controller.screen.ScreenController;
import com.memorama.model.session.SessionModel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class LevelController extends ScreenController {

    @FXML
    private Text textUser;
    @FXML
    private Button buttonProfile;
    @FXML
    private Button buttonStart;

    @FXML
    public void initialize() {
        if (SessionModel.getUser() != null) {
            textUser.setText(SessionModel.getUser().getName());
        } else {
            textUser.setText("Usuario no identificado");
        }
    }

    /**
     * Cambia a la pantalla perfil.
     */
    @FXML
    public void buttonProfileClick() {
        profileScreen(buttonProfile);
    }

    /**
     * Cambia a la pantalla iniciar.
     */
    @FXML
    public void buttonStartClick() {
        startScreen(buttonStart);
    }

}