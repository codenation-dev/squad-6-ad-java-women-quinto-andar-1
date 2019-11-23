package br.com.codenation.loglab.config;

import static br.com.codenation.loglab.config.SecurityConstants.SIGN_UP_URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityConfigurer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.codenation.loglab.service.CustomUserDetailService;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private CustomUserDetailService customUserDetailService;



//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		//super.configure(http);
//		http.authorizeRequests()
//			.antMatchers("/*/user/**").hasRole("ADMIN")
//			.antMatchers("/*/admin/**").hasRole("ADMIN")
//			//.anyRequest().authenticated()
//			.and()
//			.httpBasic()
//			.and()
//			.csrf().disable();
//	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//super.configure(http);
		http.cors().and().csrf().disable().authorizeRequests()
			.antMatchers(HttpMethod.GET, SIGN_UP_URL).permitAll()
			.antMatchers("/*/user/**").hasAuthority("ADMIN")
			.antMatchers("/log/**").hasAuthority("ADMIN")
			.antMatchers("/*/admin/**").hasAuthority("ADMIN");
		SecurityConfigurer securityConfigurerAdapter =
				new AuthTokenConfig(customUserDetailService);
		http.apply(securityConfigurerAdapter);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
		authManagerBuilder.userDetailsService(customUserDetailService).passwordEncoder(bCryptPasswordEncoder());
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	//@Autowired
	//public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	//	auth.inMemoryAuthentication()
	//		.withUser("ana").password("{noop}123").roles("USER")
	//		.and()
	//		.withUser("admin").password("{noop}123").roles("USER", "ADMIN");
		
	//}

}

