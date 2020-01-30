package com.adaming.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	private static String[] PUBLIC_MATCHERS = {
					"/",
					"/contact",
					"/css/**",
					"/images/**",
					"/js/**"
				};
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
				.antMatchers(PUBLIC_MATCHERS)
				.permitAll()
				.anyRequest().authenticated();
		
		http.formLogin().loginPage("/login").permitAll()
			.defaultSuccessUrl("/books")
			.failureUrl("/login?error")
			.and()
			.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/?logout").deleteCookies("remember-me").permitAll()
			.and().rememberMe();
	}
	
	//     google.com/?logout
}









