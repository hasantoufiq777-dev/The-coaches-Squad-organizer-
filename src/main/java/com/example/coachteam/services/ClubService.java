package com.example.coachteam.services;

import com.example.coachteam.Club;
import java.util.ArrayList;
import java.util.List;

public class ClubService {

    private static final List<Club> clubs = new ArrayList<>();

    public static void addClub(Club club) {
        clubs.add(club);
    }

    public static List<Club> getClubs() {
        return clubs;
    }


}
