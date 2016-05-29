package com.windsurf.config;

import com.windsurf.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by didierbaczynski on 16-05-29.
 */
@Configuration
@ComponentScan(basePackages = "com.windsurf")

public class AppConfig {
    @Bean
    public LongDistanceRace race() {
        List<Racer> racers = new LinkedList<Racer>();
        racers.add(didier());
        racers.add(mario());
        racers.add(krunosh());
        return new OBXRace(racers);
    }

    @Bean
    public Racer didier(){
        return new Didier();
    }

    @Bean
    public Racer mario(){
        return new Mario();
    }

    @Bean
    public Racer krunosh(){
        return new Krunosh();
    }
}
