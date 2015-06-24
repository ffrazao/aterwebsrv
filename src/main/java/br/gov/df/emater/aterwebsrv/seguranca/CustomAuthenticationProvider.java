package br.gov.df.emater.aterwebsrv.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import br.gov.df.emater.aterwebsrv.bo.TesteBo;

/**
 * Classe customizada para customizar a autentica��o de usu�rios
 * 
 * @author frazao
 * 
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private TesteBo testeBo;

	@Override
	public Authentication authenticate(Authentication autenticacao) throws AuthenticationException {

		return testeBo.autenticaUsuario(autenticacao);
	}

	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}
}