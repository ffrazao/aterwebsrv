package br.gov.df.emater.aterwebsrv.seguranca;

import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(userDetailsService());
		}

		@Bean
		UserDetailsService userDetailsService() {
//			return (username) -> accountRepository.findByUsername(username).map(a -> new User(a.username, a.password, true, true, true, true, AuthorityUtils.createAuthorityList("USER", "write")))
//					.orElseThrow(() -> new UsernameNotFoundException("could not find the user '" + username + "'"));
			return new UserDetailsService() {
				
				@SuppressWarnings("serial")
				@Override
				public UserDetails loadUserByUsername(String username)
						throws UsernameNotFoundException {
					// TODO Auto-generated method stub
					return new UserDetails() {
						
						@Override
						public boolean isEnabled() {
							// TODO Auto-generated method stub
							return false;
						}
						
						@Override
						public boolean isCredentialsNonExpired() {
							// TODO Auto-generated method stub
							return false;
						}
						
						@Override
						public boolean isAccountNonLocked() {
							// TODO Auto-generated method stub
							return false;
						}
						
						@Override
						public boolean isAccountNonExpired() {
							// TODO Auto-generated method stub
							return false;
						}
						
						@Override
						public String getUsername() {
							// TODO Auto-generated method stub
							return "Frz";
						}
						
						@Override
						public String getPassword() {
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
			};
		}
	}