package br.gov.df.emater.aterwebsrv;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.gov.df.emater.aterwebsrv.modelo.teste.Teste;
import br.gov.df.emater.aterwebsrv.servico.TesteServico;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AterWebApplication.class)
@WebAppConfiguration
public class AterWebApplicationTests {
	
	@Autowired
	private TesteServico testeServico;

	@Test
	public void contextLoads() {
		// testeServico.apagarTudo();
		
		for (Long i = 51l; i < 101; i++) {
			Teste t = testeServico.listar(i);
			t.setNome("nome putz " + i);
			testeServico.salvar(t);
		}
		Page<Teste> resposta = testeServico.listarTudo();
		
		System.out.println(resposta);
	}

}
