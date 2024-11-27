package com.realtime.websocket.registry.realtime_websocket_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RealtimeWebsocketRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealtimeWebsocketRegistryApplication.class, args);
	}

}
