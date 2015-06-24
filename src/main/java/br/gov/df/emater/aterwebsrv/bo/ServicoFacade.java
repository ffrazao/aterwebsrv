package br.gov.df.emater.aterwebsrv.bo;

import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.config.ConfigParser;
import org.apache.commons.chain.impl.CatalogFactoryBase;
import org.apache.commons.chain.impl.ContextBase;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Qualifier("servicoFacade")
public class ServicoFacade {

	protected Catalog catalog;
	protected ConfigParser parser = new ConfigParser();
	private static final String DEFAULT_XML = "/br/gov/df/emater/aterwebsrv/bo/catalago-servico.xml";

	public ServicoFacade() throws Exception {
		load(DEFAULT_XML);
	}

	public Object executar(String nomeAcao) {
		return this.executar(nomeAcao, null);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public Object executar(String nomeAcao, Object parametros) {
		Context context = new ContextBase();
		Command acao = catalog.getCommand(nomeAcao);
		try {
			acao.execute(context);
		} catch (Exception e) {
			context.put("Erro", e);
		}
		return context;
	}

	protected void load(String path) throws Exception {
		parser.parse(this.getClass().getResource(path));
		catalog = CatalogFactoryBase.getInstance().getCatalog();
	}

}