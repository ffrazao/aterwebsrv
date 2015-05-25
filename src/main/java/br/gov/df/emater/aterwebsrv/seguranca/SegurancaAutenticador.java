package br.gov.df.emater.aterwebsrv.seguranca;

import java.util.Collection;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

/**
 * Classe customizada para customizar a autentica��o de usu�rios
 * 
 * @author frazao
 * 
 */
@Component
public class SegurancaAutenticador implements AuthenticationProvider {

//	@Autowired
//	private UsuarioService service;

	@Override
	public Authentication authenticate(Authentication autenticacao) throws AuthenticationException {

//		return service.autenticaUsuario(autenticacao);
		return new Authentication() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void setAuthenticated(boolean isAuthenticated)
					throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isAuthenticated() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Object getPrincipal() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getDetails() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getCredentials() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}
}