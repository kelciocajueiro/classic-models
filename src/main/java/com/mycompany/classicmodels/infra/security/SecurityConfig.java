package com.mycompany.classicmodels.infra.security;

import com.mycompany.classicmodels.domain.enums.LoginData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static com.mycompany.classicmodels.infra.util.Pages.DATA_DISCOVERY;
import static com.mycompany.classicmodels.infra.util.Pages.FAILURE;
import static com.mycompany.classicmodels.infra.util.Pages.LOGIN;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/javax.faces.resource/**").permitAll()
                .antMatchers("/html/**").authenticated()
                .and()
            .formLogin()
                .loginPage(LOGIN.getUrl())
                    .defaultSuccessUrl(DATA_DISCOVERY.getUrl())
                    .failureUrl(FAILURE.getUrl())
                    .permitAll()
                .and()
            .logout()
                .logoutSuccessUrl(LOGIN.getUrl())
                .permitAll()
                .and()
            .csrf()
                .disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
            .withUser(LoginData.USER_ONE.getUsername())
                .password(passwordEncoder.encode(LoginData.USER_ONE.getPassword()))
                .roles(LoginData.USER_ONE.getRole())
                .and()
            .withUser(LoginData.USER_TWO.getUsername())
                .password(passwordEncoder.encode(LoginData.USER_TWO.getPassword()))
                .roles(LoginData.USER_TWO.getRole());
    }

}
