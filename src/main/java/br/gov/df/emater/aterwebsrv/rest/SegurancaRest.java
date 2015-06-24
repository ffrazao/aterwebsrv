package br.gov.df.emater.aterwebsrv.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.df.emater.aterwebsrv.bo.ServicoFacade;

@RestController
public class SegurancaRest {
	
	@Autowired
	private ServicoFacade servicoFacade;

	@RequestMapping("/login")
	public Resposta login() {
		servicoFacade.executar("TesteBo");
		return new Resposta();
	}
	
}