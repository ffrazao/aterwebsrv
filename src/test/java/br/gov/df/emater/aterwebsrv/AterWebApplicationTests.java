package br.gov.df.emater.aterwebsrv;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.gov.df.emater.aterwebsrv.bo.TesteBo;
import br.gov.df.emater.aterwebsrv.modelo.teste.Teste;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AterWebApplication.class)
@WebAppConfiguration
public class AterWebApplicationTests {

	@Autowired
	private TesteBo testeBo;

	@Test
	public void contextLoads() {
		//testeBo.apagarTudo();

		Teste t;
		for (Long i = 51l; i < 101; i++) {
			//t = testeServico.listar(i);
			t = new Teste(i);
			t.setNome("nome putz " + i);
			testeBo.salvar(t);
		}
		
		//Page<Teste> resposta = testeBo.listarTudo();

		//System.out.println(resposta);
	}

}
