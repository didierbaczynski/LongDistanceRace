package com.windsurf.entities;

import org.springframework.stereotype.Component;

/**
 * Created by didierbaczynski on 16-05-29.
 */
@Component
public class Didier implements Racer {
    @Override
    public String getName() {
        return "Didier Baczynski";
    }

    @Override
    public String getId() {
        return "B777";
    }

    @Override
    public Integer getAge() {
        return 49;
    }
}
