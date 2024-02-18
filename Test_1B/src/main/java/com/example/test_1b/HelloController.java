package com.example.test_1b;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label message;
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    private int loginCounter = 0;

    @FXML
    protected void onLogInButtonClick() {

        String usernameText = username.getText();
        String passwordText = password.getText();

        if (usernameText.isEmpty() || passwordText.isEmpty()) {
            message.setText("Please Provide Username or Password.");
        } else if (usernameText.equals("Jaspreet") || passwordText.equals("456")) {
            message.setText("Success!!!");
            loginCounter = 0;
        } else {
            loginCounter++;
            if (loginCounter >= 5) {
                message.setText("Sorry, Your Account is Locked!!!");
            } else {
                message.setText("Sorry, Invalid Username or Password.");
            }
        }

    }
}