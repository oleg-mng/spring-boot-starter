package com.olegmng.http.logging;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Slf4j
@Component
public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        log.info("request {}", httpServletRequest.getPathInfo());
        chain.doFilter(request, response);
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        log.info("response {} {}", httpServletRequest.getServletPath(), httpServletResponse.getStatus());

    }
}
