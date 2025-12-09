package com.example.coachteam.controller;

import com.example.coachteam.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class LoginController {

    public AnchorPane loginRoot;
    @FXML private TextField usernameField;

    @FXML
    private void login(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApp.class.getResource("/com/example/coachteam/dashboard-view.fxml")
            );



            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(
                    Objects.requireNonNull(
                            MainApp.class.getResource("/com/example/coachteam/styles.css")
                    ).toExternalForm()
            );

            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
