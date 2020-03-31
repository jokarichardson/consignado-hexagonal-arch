package com.richardson.consignado.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.richardson.consignado.*")
public class CreditoConsignadoRestApplication {
	private static final Logger log = LoggerFactory.getLogger(CreditoConsignadoRestApplication.class);
	
    public static void main( String[] args )
    {
        SpringApplication.run(CreditoConsignadoRestApplication.class, args);
        log.info("Aplicação REST iniciada");
    }
}
