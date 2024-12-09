/*
package com.kt.ts.userservice.util;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.ArrayList;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;

    public JwtAuthenticationFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String token = request.getHeader("Authorization");

        if (token != null && token.startsWith("Bearer ")) {
//            token = token.substring(7); // Remove "Bearer " prefix
            System.out.println("token --->>> user service ...111 " + token);
//            token = token.substring(7); // Remove "Bearer " prefix
            token = token.split(" ")[1].trim();
            System.out.println("token --->>> user service ...222 " + token);
            String username = jwtUtil.extractUsername(token);
            System.out.println("username --->>> user service ...222 " + username);
            boolean isTokenValid = jwtUtil.validateToken(token, username);
            System.out.println("isTokenValid --->>> user service ...222 " + isTokenValid);
            if (isTokenValid) {
                System.out.println("username --->>> user service ...333 " + username);
                // Create authentication token and set it in SecurityContext
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                        username, null, new ArrayList<>()
                );
                System.out.println("authentication --->>> user service ...444 " + authentication);
                SecurityContextHolder.getContext().setAuthentication(authentication);
                System.out.println("authentication --->>> user service ...444111 " + authentication);
            }
        }
        System.out.println("request --->>> user service ...555 " + request);
        System.out.println("response --->>> user service ...666 " + response);
        filterChain.doFilter(request, response);  // Proceed to the next filter in the chain
    }
}
*/
