package com.quiz.controller;

import java.util.Optional;

import com.quiz.controller.screen.ScreenController;
import com.quiz.model.Question;
import com.quiz.model.QuestionModel;
import com.quiz.model.session.SessionModel;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
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

    private Integer answers;
    private Integer hits;
    private QuestionModel questionModel;
    private Optional<Question> optional;

    public PlayController() {
        this.answers = 0;
        this.hits = 0;
    }

    @FXML
    public void initialize() {
        questionModel = new QuestionModel();
        optional = questionModel.getRandomQuestion();
        textUser.setText(SessionModel.getUser().getName());
        textPoint.setText(hits.toString());
        textQuestion.setText(optional.get().getQuestionText());
        buttonAnswer1.setText(optional.get().getAnswer1());
        buttonAnswer2.setText(optional.get().getAnswer2());
        buttonAnswer3.setText(optional.get().getAnswer3());
        buttonAnswer4.setText(optional.get().getAnswer4());
    }

    @FXML
    private void buttonAnswer1Click() {
        checkAnswer(1);
    }

    @FXML
    private void buttonAnswer2Click() {
        checkAnswer(2);
    }

    @FXML
    private void buttonAnswer3Click() {
        checkAnswer(3);
    }

    @FXML
    private void buttonAnswer4Click() {
        checkAnswer(4);
    }

    @FXML
    private void buttonReturnClick() {
        levelScreen(buttonReturn);
    }

    private void checkAnswer(int selectAnswer) {
        answers++;
        if(optional.isPresent() && optional.get().getCorrectAnswer() == selectAnswer) {
            hits++;
            textPoint.setText(hits.toString());
        }
        if(answers == 10) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("¡Juego terminado!");
            alert.setHeaderText(null);
            alert.setContentText("Has acertado " + hits);
            alert.showAndWait();
            buttonReturnClick();
        }
        optional = questionModel.getRandomQuestion();
        textQuestion.setText(optional.get().getQuestionText());
        buttonAnswer1.setText(optional.get().getAnswer1());
        buttonAnswer2.setText(optional.get().getAnswer2());
        buttonAnswer3.setText(optional.get().getAnswer3());
        buttonAnswer4.setText(optional.get().getAnswer4());
    }

}