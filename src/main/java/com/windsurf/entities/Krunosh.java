package com.windsurf.entities;

import org.springframework.stereotype.Component;

/**
 * Created by didierbaczynski on 16-05-29.
 */
@Component

public class Krunosh implements Racer{
    @Override
    public String getName() {
        return "Krunosh Kiani";
    }

    @Override
    public String getId() {
        return "D83";
    }

    @Override
    public Integer getAge() {
        return 31;
    }
}
