package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for our sad fortune service
	
	@Bean
	public FortuneService sadFortuneService() { // sad fortune service bean id oluyor. 
		return new SadFortuneService();
	}
	
	//define bean for our swim coach AND inject dependency
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService()); //fortune service metod name and Coach metdod return method parameter must be same . 
	}
	
	
	//ALTTAKİ METODLARI PİNG-PONG COACH İÇİN TANIMLADIK.
	@Bean
	public FortuneService marin() {
		return new MarinFortuneService();
	}
	
	@Bean
	public Coach pingPongCoach() {
		return new PingPongCoach(marin());
	}

}
