package com.windsurf;

import com.windsurf.config.AppConfig;
import com.windsurf.entities.LongDistanceRace;
import com.windsurf.entities.OBXRace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LongDistanceAppsApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		LongDistanceRace race_1 = context.getBean("race", OBXRace.class);

		System.out.println(race_1.runRace());
	}
}
