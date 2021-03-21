package com.example.servingwebcontent;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService userDetailsService() {
		return new MyUserDetailsService();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		
		return authProvider;
	}
	@Autowired
	AuthenticationSuccessHandler successHandler;
	
	
	public class RefererRedirectionAuthenticationSuccessHandler extends 
	SimpleUrlAuthenticationSuccessHandler {
	
	public RefererRedirectionAuthenticationSuccessHandler() {
		super();
		setUseReferer(true);
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest arg0, HttpServletResponse arg1, Authentication arg2)
			throws IOException, ServletException {
		
	}
	
	}
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/css/", "/images/").permitAll()
		.antMatchers("/home/").hasAnyAuthority("ADMIN")
		.antMatchers("/refDrPanel/").hasAnyAuthority( "REFDR")
		.antMatchers("/techPanel").hasAnyAuthority("TECH")
		.antMatchers("/radiologistsPanel").hasAnyAuthority( "RADIOLOGISTS")
		.antMatchers("/receptionistsPanel").hasAnyAuthority( "RECEPTIONISTS")

		.anyRequest().authenticated()

		.and().formLogin().loginPage("/login").loginProcessingUrl("/login_user")
		.successHandler(new RefererRedirectionAuthenticationSuccessHandler ())
		.failureUrl("/login?error=loginError").defaultSuccessUrl("/home").permitAll()

		.and().logout().logoutUrl("/user_logout").logoutSuccessUrl("/login").deleteCookies("JSESSIONID")

		//.and().exceptionHandling().accessDeniedPage("/403")
		.and().csrf().disable();
	}
}
