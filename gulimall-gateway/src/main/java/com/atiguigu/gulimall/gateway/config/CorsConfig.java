package com.atiguigu.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

//跨域配置
@Configuration
public class CorsConfig {
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        //任意请求来源
        config.addAllowedOrigin("*");
        //是否允许携带cookie
        config.setAllowCredentials(true);
        source.registerCorsConfiguration("/**",config);
        return new CorsWebFilter(source);
    }
}
