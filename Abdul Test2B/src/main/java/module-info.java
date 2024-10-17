module com.example.abdulTest {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.abdulTest to javafx.fxml;
    exports com.example.abdulTest;
}