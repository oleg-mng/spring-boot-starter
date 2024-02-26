package com.olegmng;

import com.olegmng.http.logging.LoggingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpLoggingAutoConfiguration {

    @Bean
    public LoggingFilter loggingFilter(){
        return new LoggingFilter();
    }
}

