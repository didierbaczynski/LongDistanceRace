package com.windsurf.entities;

import org.springframework.stereotype.Component;

/**
 * Created by didierbaczynski on 16-05-29.
 */
@Component
public class Mario implements Racer{
    @Override
    public String getName() {
        return "Mario Bergeron";
    }

    @Override
    public String getId() {
        return "190";
    }

    @Override
    public Integer getAge() {
        return 48;
    }
}
