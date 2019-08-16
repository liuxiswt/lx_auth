package com.lx.auth.common.security;

import com.lx.auth.common.utils.ConvertUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtFilter extends OncePerRequestFilter {

    @Value("${jwt.header}")
    private String token_header;
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.tokenHead}")
    private String token_prefix;


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

    }

    protected String getJwtToken(HttpServletRequest request){
        String tokenInfo = request.getHeader(token_header);
        return ConvertUtil.removeStart(tokenInfo,token_prefix);
    }

}
