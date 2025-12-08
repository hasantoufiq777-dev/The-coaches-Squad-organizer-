package com.example.coachteam.controller;

import com.example.coachteam.Club;
import com.example.coachteam.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import com.example.coachteam.services.ClubService;

public class DashboardController {

    @FXML private Label totalPlayersLabel;
    @FXML private Label totalManagersLabel;

    public void initialize() {
        int players = 0;
        int managers = 0;

        for (Club c : ClubService.getClubs()) {
           // players += c.getPlayers().size();
           // managers += c.getManagers().size();
        }

        totalPlayersLabel.setText(String.valueOf(players));
        totalManagersLabel.setText(String.valueOf(managers));
    }
}
