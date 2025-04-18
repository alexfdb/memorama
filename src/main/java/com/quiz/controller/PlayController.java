package com.quiz.controller;

import java.util.Optional;

import com.quiz.controller.screen.ScreenController;
import com.quiz.model.Question;
import com.quiz.model.QuestionModel;
import com.quiz.model.session.SessionModel;

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

    private QuestionModel questionModel;
    private Optional<Question> optional;

    @FXML
    public void initialize() {
        questionModel = new QuestionModel();
        optional = questionModel.getRandomQuestion();
        textUser.setText(SessionModel.getUser().getName());
        textQuestion.setText(optional.get().getQuestionText());
        buttonAnswer1.setText(optional.get().getAnswer1());
        buttonAnswer2.setText(optional.get().getAnswer2());
        buttonAnswer3.setText(optional.get().getAnswer3());
        buttonAnswer4.setText(optional.get().getAnswer4());
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