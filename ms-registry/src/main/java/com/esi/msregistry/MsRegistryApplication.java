package com.esi.msregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRegistryApplication.class, args);
	}

}
