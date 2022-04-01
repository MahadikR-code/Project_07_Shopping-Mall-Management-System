/* This is the entry point of the project. To run the application, Run as  "Spring Boot App".
*  and check whether the server is initialized or not.
*/

// Package name
package com.tns.cg.smms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This is used while initializing spring boot project.
public class ShoppingMallManagementSystemApplication {

	// Main method
	public static void main(String[] args) {
		SpringApplication.run(ShoppingMallManagementSystemApplication.class, args);
	}

}
