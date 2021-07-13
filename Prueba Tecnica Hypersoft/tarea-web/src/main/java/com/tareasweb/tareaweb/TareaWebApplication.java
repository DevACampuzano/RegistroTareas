package com.tareasweb.tareaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareaWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(TareaWebApplication.class, args);
		
	}

	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("//Numero del Puerto");
			}
		};
	}*/
}
