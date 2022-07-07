package com.formacionbdi.springboot.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean("clienteRest")
	@LoadBalanced //va a utilizar ribbon para balanceo de carga
	public RestTemplate registrarRestTemplate() {//RestTemplate x debajo utilizando balanceador busca la mejor instancia disponible
		return new RestTemplate();
	}
	
}
