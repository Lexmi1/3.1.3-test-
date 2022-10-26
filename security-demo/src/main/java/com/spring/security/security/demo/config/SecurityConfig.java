package com.spring.security.security.demo.config;

import com.spring.security.security.demo.security.AuthProviderImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final AuthProviderImp authProviderImp;

    @Autowired
    public SecurityConfig(AuthProviderImp authProviderImp) {
        this.authProviderImp = authProviderImp;
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProviderImp); //скоро сюда внетрим провайдер для аутентификации
    }
}
