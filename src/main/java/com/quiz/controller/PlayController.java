package com.quiz.controller;

import com.quiz.controller.screen.ScreenController;
import com.quiz.model.Question;
import com.quiz.model.QuestionModel;
import com.quiz.model.User;
import com.quiz.model.UserModel;
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
    private Question question;

    public PlayController() {
        this.answers = 0;
        this.hits = 0;
    }

    @FXML
    public void initialize() {
        questionModel = new QuestionModel();
        question = questionModel.getRandomQuestion();
        textUser.setText(SessionModel.getUser().getName());
        textPoint.setText("Respuestas: " + answers.toString() + "/10");
        textQuestion.setText(question.getQuestionText());
        buttonAnswer1.setText(question.getAnswer1());
        buttonAnswer2.setText(question.getAnswer2());
        buttonAnswer3.setText(question.getAnswer3());
        buttonAnswer4.setText(question.getAnswer4());
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
        SessionModel.setLevel("Medium");
        levelScreen(buttonReturn);
    }

    /**
     * Comprueba la respuesta dada, cuando llega a diez el juego acaba.
     * 
     * @param selectAnswer respuesta seleccionada.
     */
    private void checkAnswer(int selectAnswer) {
        answers++;
        textPoint.setText("Respuestas: " + answers.toString() + "/10");
        if (question.getCorrectAnswer() == selectAnswer) {
            hits++;
        }
        if (answers == 10) {
            updateUser();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("¡Juego terminado!");
            alert.setHeaderText(null);
            alert.setContentText("Has acertado " + hits);
            alert.showAndWait();
            buttonReturnClick();
        }
        question = questionModel.getRandomQuestion();
        textQuestion.setText(question.getQuestionText());
        buttonAnswer1.setText(question.getAnswer1());
        buttonAnswer2.setText(question.getAnswer2());
        buttonAnswer3.setText(question.getAnswer3());
        buttonAnswer4.setText(question.getAnswer4());
    }

    private void updateUser() {
        UserModel userModel = new UserModel();
        User user = new User(SessionModel.getUser().getName(), SessionModel.getUser().getPassword(),
                SessionModel.getUser().getAnswers() + answers, SessionModel.getUser().getHits() + hits);
        userModel.updateUser(SessionModel.getUser(), user);
        SessionModel.startSesion(user);
    }

}