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
public class PlayController extends ScreenController {
    
    @FXML
    private Text textUser;
    @FXML
    private Text textPoint;
    @FXML
    private Text textTime;
    @FXML
    private Text textQuestion;
    @FXML
    private Button buttonAnswer1;
    @FXML
    private Button buttonAnswer2;
    @FXML
    private Button buttonAnswer3;
    @FXML
    private Button buttonAnswer4;
    @FXML
    private Button buttonReturn;

    @FXML
    public void initialize() {
        textUser.setText(SessionModel.getUser().getName());
    }

    @FXML
    private void buttonAnswer1Click() {

    }

    @FXML
    private void buttonAnswer2Click() {
        
    }

    @FXML
    private void buttonAnswer3Click() {
        
    }

    @FXML
    private void buttonAnswer4Click() {
        
    }

    @FXML
    private void buttonReturnClick() {
        levelScreen(buttonReturn);
    }

}