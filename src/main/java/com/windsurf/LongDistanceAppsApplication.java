package com.windsurf;

import com.windsurf.config.AppConfig;
import com.windsurf.entities.LongDistanceRace;
import com.windsurf.entities.OBXRace;
import com.windsurf.entities.Racer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class LongDistanceAppsApplication {

	public static void main(String[] args) {
		List <Racer> racers;
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		LongDistanceRace race_1 = context.getBean("race", OBXRace.class);

		racers = race_1.runRace();
		for (Racer racer:racers) {
			System.out.println(racer.getName());
			System.out.println(racer.getAge());
			System.out.println(racer.getId());
		}
	}
}
