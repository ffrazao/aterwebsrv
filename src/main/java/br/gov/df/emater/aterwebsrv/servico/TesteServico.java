package br.gov.df.emater.aterwebsrv.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.df.emater.aterwebsrv.modelo.teste.Teste;
import br.gov.df.emater.aterwebsrv.persistencia.TesteRepository;

@Service
@Qualifier("testeServico")
public class TesteServico {

	@Autowired
	private TesteRepository testeRepository;

	@Transactional
	public void salvar(Teste teste) {
		testeRepository.save(teste);
	}

	@Transactional
	public void apagarTudo() {
		testeRepository.deleteAll();
	}

	@Transactional(readOnly = true)
	public Page<Teste> listarTudo() {
		return testeRepository.findAll(new PageRequest(1, 20));
	}

	@Transactional(readOnly = true)
	public Teste listar(Long id) {
		return testeRepository.findOne(id);
	}

}