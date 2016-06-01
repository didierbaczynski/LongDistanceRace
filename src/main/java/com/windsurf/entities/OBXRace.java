package com.windsurf.entities;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by didierbaczynski on 16-05-29.
 */
public class OBXRace implements LongDistanceRace {
    List<Racer> racers = new LinkedList<>();

    @Override
    public void addRacer(Racer racer) {
        racers.add(racer);
    }

    @Override
    public List<Racer> runRace() {
        return racers;
    }

}
