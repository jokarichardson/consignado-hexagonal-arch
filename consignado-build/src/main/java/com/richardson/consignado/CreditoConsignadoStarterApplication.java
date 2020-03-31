package com.richardson.consignado;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.richardson.consignado.rest.CreditoConsignadoRestApplication;

@SpringBootApplication
@ComponentScan(basePackages = "com.richardson.consignado.*")
public class CreditoConsignadoStarterApplication {
	private static final Logger log = LoggerFactory.getLogger(CreditoConsignadoStarterApplication.class);
	
    public static void main( String[] args )
    {
        log.info("Iniciando aplicação");
    	SpringApplication.run(CreditoConsignadoRestApplication.class, args);
        log.info("Iniciando aplicação");
        log.info("Data atual ZoneId.systemDefault {}", LocalDateTime.now(ZoneId.systemDefault()));
        log.info("Data atual ZoneOffset.UTC {}", LocalDateTime.now(ZoneOffset.UTC));
        log.info("Data atual ZoneId.of {}", LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
    }
}
