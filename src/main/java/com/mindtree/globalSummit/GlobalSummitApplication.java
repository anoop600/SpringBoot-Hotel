package com.mindtree.globalSummit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.mindtree.globalSummit")
@SpringBootApplication
public class GlobalSummitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalSummitApplication.class, args);
	}

}
