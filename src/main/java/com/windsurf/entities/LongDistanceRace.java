package com.windsurf.entities;

import java.util.List;

/**
 * Created by didierbaczynski on 2016-05-23.
 */
public interface LongDistanceRace {
    void addRacer(Racer racer);
    List<Racer> runRace();
}

