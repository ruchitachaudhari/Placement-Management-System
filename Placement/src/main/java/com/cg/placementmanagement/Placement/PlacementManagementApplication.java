package com.cg.placementmanagement.Placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PlacementManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementManagementApplication.class, args);
	}
	
	

}
