package br.gov.df.emater.aterwebsrv.persistencia;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "br.gov.df.emater.aterwebsrv.persistencia")
@EntityScan(basePackages = "br.gov.df.emater.aterwebsrv.modelo")
public class JpaConfig {

}
