package br.gov.df.emater.aterwebsrv.seguranca;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SegurancaInicializador extends AbstractSecurityWebApplicationInitializer {

	public SegurancaInicializador() {
		super(SegurancaConfig.class);
	}

}
