package com.ItRoid.ServidorConfiguraciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServidorConfiguracionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorConfiguracionesApplication.class, args);
	}

}
