package com.mine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
class WazzupHealthIndicator implements HealthIndicator {
	@Override
	public Health health() {
		return Health.status("Application is health").build();
	}
}

@SpringBootApplication
public class WazzupApplication {

	public static void main(String[] args) {
		SpringApplication.run(WazzupApplication.class, args);
	}
}

