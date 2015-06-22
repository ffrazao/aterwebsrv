package br.gov.df.emater.aterwebsrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class AterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AterWebApplication.class, args);
    }
}
