package com.https.httpexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpexampleApplication {

	@GetMapping("/get")
	public String getMessage(){
		System.out.println("entering here");
		System.out.println("entering two here");
		return "Hello World using SSL and HTTPS !!!! connection established";
	}
	public static void main(String[] args) {
		SpringApplication.run(HttpexampleApplication.class, args);
	}

}
