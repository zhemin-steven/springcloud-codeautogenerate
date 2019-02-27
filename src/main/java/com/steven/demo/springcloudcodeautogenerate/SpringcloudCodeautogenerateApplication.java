package com.steven.demo.springcloudcodeautogenerate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class SpringcloudCodeautogenerateApplication {

	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(SpringcloudCodeautogenerateApplication.class);
		sa.addListeners(new ApplicationPidFileWriter());
		sa.run(args);
	}

}
