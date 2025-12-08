
package com.example.coachteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Club {

    private final String name;
    private final List<Player> players = new ArrayList<>();


    public Club(String name) {
        this.name = Objects.requireNonNull(name, "name must not be null");
    }

    public String getName() {
        return name;
    }


    public List<Player> getPlayers() {
        return Collections.unmodifiableList(new ArrayList<>(players));
    }




    public void addPlayer(Player p) {
        Objects.requireNonNull(p, "player must not be null");
        if (!players.contains(p)) {
            players.add(p);
            p.setClub(this);
        }
    }

    public boolean removePlayer(Player p) {
        Objects.requireNonNull(p, "player must not be null");
        boolean removed = players.remove(p);
        if (removed) {
            p.setClub(null);
        }
        return removed;
    }



}
