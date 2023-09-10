package com.example.javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button CreateSigngButton;

    @FXML
    private Button PlaySingUpButton;

    @FXML
    private CheckBox SingUpChecjkBoxFemale;

    @FXML
    private CheckBox SingUpChecjkBoxMale;

    @FXML
    private TextField SingUpGuild;

    @FXML
    private TextField SingUpName;

    @FXML
    private PasswordField SingUpServer;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {

    }

}

