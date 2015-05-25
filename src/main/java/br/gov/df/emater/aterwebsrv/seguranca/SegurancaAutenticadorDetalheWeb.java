package br.gov.df.emater.aterwebsrv.seguranca;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

public class SegurancaAutenticadorDetalheWeb extends WebAuthenticationDetails {

	private static final long serialVersionUID = 1L;

	private boolean acessoComoAdministradorDoSistema;

	public SegurancaAutenticadorDetalheWeb(HttpServletRequest request, boolean administrador) {
		super(request);
		setAcessoComoAdministradorDoSistema(administrador);
	}

	public boolean getAcessoComoAdministradorDoSistema() {
		return acessoComoAdministradorDoSistema;
	}

	public void setAcessoComoAdministradorDoSistema(boolean administrador) {
		this.acessoComoAdministradorDoSistema = administrador;
	}

}