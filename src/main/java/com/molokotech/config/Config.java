package com.molokotech.config;
import org.springframework.context.annotation.Configuration;


//@Configuration
////@EnableOAuth2Sso
//public class Config extends WebSecurityConfigurerAdapter{
//
//	
//	  @Override
//	  protected void configure(HttpSecurity http) throws Exception {
//	    http
//	      .antMatcher("/**")
//	      .authorizeRequests()
//	        .antMatchers("/", "/login**", "/index", "/default", "/webjars/**", "/error**", "/dist/**", "/img/**")
//	        .permitAll()
//	      .anyRequest()
////	        .authenticated().and().logout().logoutSuccessUrl("/").permitAll();
//	        .authenticated().and().logout().logoutSuccessUrl("/").permitAll().and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());;
////	      .authenticated().and().logout().permitAll().and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());;
//	  }
//}
