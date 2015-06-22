package br.gov.df.emater.aterwebsrv.persistencia;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.df.emater.aterwebsrv.modelo.teste.Teste;

@Repository
@Qualifier(value = "testeRepository")
public interface TesteRepository extends JpaRepository<Teste, Long> {

	public Teste findByNome(String nome);

}