package com.client.two.clienteurekatwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class ClientEurekaTwoApplication {

	@RequestMapping("/")
	public String serviceInstanceName(){
		return "Hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientEurekaTwoApplication.class, args);
	}

}
