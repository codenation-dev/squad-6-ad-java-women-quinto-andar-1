package br.com.codenation.loglab.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
    			/* http.authorizeRequests()
                .antMatchers(HttpMethod.POST, "/user").permitAll()
                .antMatchers(HttpMethod.GET, "/user").authenticated(); */
        
		        http.cors().and().antMatcher("/**").authorizeRequests()
				.antMatchers(HttpMethod.GET,"/user").permitAll()
				.antMatchers(HttpMethod.GET,"/user/**").permitAll()
				.antMatchers(HttpMethod.POST,"/user").permitAll()
				
				.antMatchers(HttpMethod.GET,"/log").permitAll()
				.antMatchers(HttpMethod.GET,"/log/**").permitAll()
				.antMatchers(HttpMethod.POST,"/log").permitAll()
				
				.anyRequest().authenticated();
    }
}
