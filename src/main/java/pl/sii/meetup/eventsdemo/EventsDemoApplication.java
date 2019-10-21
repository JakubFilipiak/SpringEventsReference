package pl.sii.meetup.eventsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EventsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run( EventsDemoApplication.class, args);
	}

}
