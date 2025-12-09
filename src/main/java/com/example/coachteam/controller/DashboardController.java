package com.example.coachteam.controller;

import com.example.coachteam.Club;
import com.example.coachteam.services.ClubService;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;

import java.util.Objects;

public class DashboardController {

    @FXML private AnchorPane dashboardRoot;
    @FXML private Label totalPlayersLabel;
    @FXML private Label totalManagersLabel;

    @FXML
    public void initialize() {


        dashboardRoot.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                newScene.getStylesheets().add(
                        Objects.requireNonNull(
                                getClass().getResource("/com/example/coachteam/styles.css")
                        ).toExternalForm()
                );
            }
        });


        int players = 0;
        int managers = 0;

        for (Club c : ClubService.getClubs()) {
            players += c.getPlayers().size();
            // managers += c.getManagers().size();
        }


        totalPlayersLabel.setText(String.valueOf(players));
        totalManagersLabel.setText(String.valueOf(managers));
    }
}
