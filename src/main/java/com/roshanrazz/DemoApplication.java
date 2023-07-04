package com.roshanrazz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
//@CrossOrigin(origins="*")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	 @Bean
	 public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		 return builder.routes()
	                .route(r -> r.path("/allergy-service/**")
	                		.filters(f -> f.rewritePath("/allergy-service/(?<remaining>.*)", "/api/v1/${remaining}"))
	                        .uri("http://129.146.132.231:9002"))
	                
	                .route(r -> r.path("/appointment-service/**")
	                		.filters(f -> f.rewritePath("/appointment-service/(?<remaining>.*)", "/api/v1/${remaining}"))
	                        .uri("http://129.146.132.231:9003"))
	                
	                .route(r -> r.path("/authentication-service/**")
	                		.filters(f -> f.rewritePath("/authentication-service/(?<remaining>.*)", "/api/v1/${remaining}"))
	                        .uri("http://129.146.132.231:9004"))
	                
	                .route(r -> r.path("/patient-info-service/**")
	                		.filters(f -> f.rewritePath("/patient-info-service/(?<remaining>.*)", "/api/v1/${remaining}"))
	                        .uri("http://129.146.132.231:9005"))
	                
	                .route(r -> r.path("/health-record-service/**")
	                		.filters(f -> f.rewritePath("/health-record-service/(?<remaining>.*)", "/api/v1/${remaining}"))
	                        .uri("http://129.146.132.231:9006"))
	                
	                .route(r -> r.path("/physician-availability-service/**")
	                		.filters(f -> f.rewritePath("/physician-availability-service/(?<remaining>.*)", "/api/v1/${remaining}"))
	                        .uri("http://129.146.132.231:9007"))
	                
	                .route(r -> r.path("/notification-service/**")
	                		.filters(f -> f.rewritePath("/notification-service/(?<remaining>.*)", "/api/v1/${remaining}"))
	                        .uri("http://129.146.132.231:9008"))
	                
	                .route(r -> r.path("/auth0-service/**")
	                		.filters(f -> f.rewritePath("/auth0-service/(?<remaining>.*)", "/api/v1/${remaining}"))
	                        .uri("http://129.146.132.231:9009"))
	                
	                .build();
	    }

}
