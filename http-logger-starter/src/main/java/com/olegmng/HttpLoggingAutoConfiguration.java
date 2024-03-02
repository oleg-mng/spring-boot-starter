package com.olegmng;

import com.olegmng.http.logging.LoggingFilter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(LoggingProperties.class)
public class HttpLoggingAutoConfiguration {

    @Bean
    LoggingFilter loggingFilter(LoggingProperties properties){
        return new LoggingFilter(properties);
    }
}

