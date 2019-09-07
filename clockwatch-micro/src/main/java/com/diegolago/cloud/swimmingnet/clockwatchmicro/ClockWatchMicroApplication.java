package com.diegolago.cloud.swimmingnet.clockwatchmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClockWatchMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClockWatchMicroApplication.class, args);
	}

}
