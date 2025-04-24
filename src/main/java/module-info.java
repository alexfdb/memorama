module com.quiz {
    requires javafx.fxml;
    requires javafx.controls;
    requires transitive java.sql;
    requires org.controlsfx.controls;
    requires transitive javafx.graphics;

    exports com.quiz;
    exports com.quiz.model;
    exports com.quiz.controller;

    opens com.quiz to javafx.fxml;
    opens com.quiz.model to javafx.fxml;
    opens com.quiz.controller to javafx.fxml;
}