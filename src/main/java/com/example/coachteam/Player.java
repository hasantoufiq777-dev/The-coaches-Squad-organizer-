package com.example.coachteam;

import java.time.LocalDate;

public class Player {

    private String name;
    private LocalDate dob;
    private int jersey;
    private Position position;
    private boolean injured;


    public Player(String name, LocalDate dob, int jersey, Position position) {
        this.name = name;
        this.dob = dob;
        this.jersey = jersey;
        this.position = position;
        this.injured = false;
    }

    public String getName() {
        return name;
    }
    public LocalDate getDob() {
        return dob;
    }
    public int getJersey() {
        return jersey;
    }
    public Position getPosition() {
        return position;
    }
    public boolean isInjured() {
        return injured;
    }



    public void setInjured(boolean injured) {
        this.injured = injured;
    }
}
