module com.example.test_1b {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.test_1b to javafx.fxml;
    exports com.example.test_1b;
}