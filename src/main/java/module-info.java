module com.memorama {
    requires javafx.fxml;
    requires javafx.controls;
    requires transitive java.sql;
    requires org.controlsfx.controls;
    requires transitive javafx.graphics;

    exports com.memorama;
    exports com.memorama.model;
    exports com.memorama.controller;

    opens com.memorama to javafx.fxml;
    opens com.memorama.model to javafx.fxml;
    opens com.memorama.controller to javafx.fxml;
}