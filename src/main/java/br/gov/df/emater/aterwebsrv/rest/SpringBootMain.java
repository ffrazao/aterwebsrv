package br.gov.df.emater.aterwebsrv.rest;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@EnableAutoConfiguration
public class SpringBootMain {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootMain.class, args);
    }

}