//package com.megamind.ToDoApp.security
//
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.security.config.annotation.web.builders.HttpSecurity
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
//import org.springframework.security.config.annotation.web.invoke
//import org.springframework.security.web.SecurityFilterChain
//
//
//@Configuration
//@EnableWebSecurity
//class SecurityConf{
//
//
//
//
//    @Bean
//    open fun filterChain(http: HttpSecurity): SecurityFilterChain {
//        http {
//            authorizeHttpRequests {
//
//                authorize("/**", permitAll)
//
//            }
//            formLogin { }
//            httpBasic { }
//        }
//
//
//        return http.build()
//    }
//
//}