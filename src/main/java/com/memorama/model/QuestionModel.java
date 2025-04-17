package com.memorama.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.memorama.model.database.DatabaseModel;

/**
 * @author alexfdb
 * @version 1.0.0
 */
public class QuestionModel extends DatabaseModel {
    
    /**
     * Constructor general.
     */
    public QuestionModel() {
        super();
    }

    /**
     * Obtiene 10 preguntas aleatorias de la base de datos.
     * 
     * @return una lista de 10 preguntas.
     */
    public List<Question> getRandomQuestions() {
        List<Question> questions = new ArrayList<>();
        String query = "SELECT id, question, answer1, answer2, answer3, answer4, correct_answer FROM questions ORDER BY RANDOM() LIMIT 10";
        try (Connection connection = createConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Question question = new Question(
                    resultSet.getInt("id"),
                    resultSet.getString("question"),
                    resultSet.getString("answer1"),
                    resultSet.getString("answer2"),
                    resultSet.getString("answer3"),
                    resultSet.getString("answer4"),
                    resultSet.getInt("correct_answer")
                );
                questions.add(question);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return questions;
    }

}