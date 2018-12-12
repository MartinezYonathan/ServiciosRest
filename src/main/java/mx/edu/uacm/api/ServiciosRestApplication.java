package mx.edu.uacm.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class ServiciosRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiciosRestApplication.class, args);
		
		
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer(){
		
		return new WebMvcConfigurerAdapter() {
			
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/api/curso")
				.allowedOrigins("http://localhost:4200").allowedMethods("*");
//                registry.addMapping("/api/actualizar")
//				.allowedOrigins("https://test-uacm.herokuapp.com").allowedMethods("*");
			}
		};
		
	}
}
