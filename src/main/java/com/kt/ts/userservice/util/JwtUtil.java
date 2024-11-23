package com.kt.ts.authservice.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    // Secure key for HS256
    private Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);  // Secure key generation for HS256

    private long expirationTime = 1000 * 60 * 60; // 1 hour in milliseconds

    // Generate a JWT token
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(secretKey)  // Use the secure key
                .compact();
    }

    // Extract claims (payload) from the JWT token
    public Claims extractClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)  // Use the same key to validate the JWT
                .build()
                .parseClaimsJws(token)
                .getBody();  // Parse and extract claims from the JWT
    }

    // Extract the username from the JWT token
    public String extractUsername(String token) {
        return extractClaims(token).getSubject();
    }

    // Check if the token is expired
    public boolean isTokenExpired(String token) {
        return extractClaims(token).getExpiration().before(new Date());
    }

    // Validate the token with the username
    public boolean validateToken(String token, String username) {
        return (username.equals(extractUsername(token)) && !isTokenExpired(token));
    }
}
