package com.iam.authentication_server_iam;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ConfigApp {

    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

	http.formLogin(Customizer.withDefaults());

        
    return http.build();

    }
    
}
