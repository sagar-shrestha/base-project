//package com.sagar.baseproject.security.config;
//
//import com.sagar.baseproject.security.service.CustomUserDetailService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@RequiredArgsConstructor
//@EnableWebSecurity
//@EnableMethodSecurity()
//public class SecurityConfig {
//
//    private final CustomUserDetailService customUserDetailService;
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return customUserDetailService;
//    }
//
//    @Bean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//        daoAuthenticationProvider.setUserDetailsService(userDetailsService());
//        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//        return daoAuthenticationProvider;
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(request -> {
//                    request.requestMatchers("/base/**").permitAll();
//                    request.requestMatchers("/assets/**").permitAll();
//                    request.requestMatchers("/super").permitAll();
//                    request.requestMatchers("/web/**").hasAnyRole("SUPER_ADMIN", "ADMIN");
//                    request.anyRequest().authenticated();
//                })
//                .formLogin(httpSecurityFormLoginConfigurer -> {
//                    httpSecurityFormLoginConfigurer.loginPage("/login")
//                            .loginProcessingUrl("/base/login")
//                        //    .defaultSuccessUrl("/web/home")
//                        .permitAll();
//                })
//                .build();
//    }
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
