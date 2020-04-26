package com.pradeep.springboothello;

import java.util.Arrays;
import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2
@ComponentScan(basePackages={"com"})
@RestController
@SpringBootApplication
public class SpringBootHelloApplication {

	
	@RequestMapping("/hello")
	public    String hello(){
	return "Hello World!!!";
	}
	
	
	@RequestMapping("/welcome")
	public    String welcome(){
	return "Welcome....";
	}
	
	@GetMapping("/products")
	public    List products(){
	return Arrays.asList("Mobile","Camera","Router");
	}
	
	
	
	public SpringBootHelloApplication() {
	System.out.println("SpringBootHelloApplication   created......");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloApplication.class, args);
	}

}
