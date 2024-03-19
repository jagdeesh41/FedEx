package com.example.dtopattern.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SpringSecurityConfig
{
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {

        http.csrf((csrf)->csrf.disable()).
                authorizeHttpRequests((authorize)->{
//                    authorize.requestMatchers(HttpMethod.POST,"/api/users").hasRole("ADMIN");
//                    authorize.requestMatchers(HttpMethod.PUT,"/api/users").hasRole("ADMIN");
//                    authorize.requestMatchers(HttpMethod.DELETE,"/api/users").hasRole("ADMIN");
////                    authorize.requestMatchers(HttpMethod.GET,"/api/users").hasAnyRole("ADMIN","USER");
//                    authorize.requestMatchers(HttpMethod.GET,"/api/users").permitAll();
                    authorize.anyRequest().authenticated();
                }).httpBasic(Customizer.withDefaults());
        return http.build();





    }

    @Bean
    public static PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public UserDetailsService userDetailsService()
    {

        UserDetails ramesh= User.builder()
                .username("ramesh")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .build();
        UserDetails admin= User.builder()
                .username("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();
        

        return new InMemoryUserDetailsManager(ramesh,admin);

    }


}
