package com.windsurf.config;

import com.windsurf.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by didierbaczynski on 16-05-29.
 */
@Configuration
@ComponentScan(basePackages = "com.windsurf")

public class AppConfig {
    @Bean
    public LongDistanceRace race() {
        LongDistanceRace race_1 = new OBXRace();
        race_1.addRacer(didier());
        race_1.addRacer(mario());
        race_1.addRacer(krunosh());
        return race_1;
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
