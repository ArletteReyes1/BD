package com.agenciaviajes.agenciaviajes.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		return http.csrf(csrf->csrf.disable() )
				.authorizeHttpRequests(  auth-> auth.anyRequest().permitAll() )
				.httpBasic(withDefaults()).build();
	}//configure
	@Bean
	public PasswordEncoder encoder() {//Permite generar un cifrador de contraseñas. 
		//Se llama desde UsuarioService, para que sea pasado por autowired y 
		//pueda cifrar contraseñas. Se instancia 1 vez por que es un Bean.
		return new BCryptPasswordEncoder();
	}
}
