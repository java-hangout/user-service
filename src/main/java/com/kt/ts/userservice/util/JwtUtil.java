/*
package com.kt.ts.userservice.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

@Component
public class JwtUtil {

    // Secure key for HS256
//    private Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);  // Secure key generation for HS256
    private String SECRET_KEY = "sh2+3JRuzIaVMCGxBPeDMSzUFwDBLscv4R77LYntGns=";
    private Key secretKey = Keys.hmacShaKeyFor(Base64.getDecoder().decode(SECRET_KEY));
//    private Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private long expirationTime = 1000 * 60 * 60; // 1 hour in milliseconds

    // Generate a JWT token
    public String generateToken(String username) {
        return Jwts.builder().setSubject(username).setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis() + expirationTime)).signWith(secretKey)  // Use the secure key
                .compact();
    }

    // Extract claims (payload) from the JWT token
    */
/*public Claims extractClaims(String token) {
        System.out.println("token --->>> extractClaims ... " + token);
        return Jwts.parser().setSigningKey(secretKey)  // Use the same key to validate the JWT
                .build().parseClaimsJws(token).getBody();  // Parse and extract claims from the JWT
    }*//*

    */
/*public Claims extractClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }*//*

    public Claims extractClaims(String token) {
        System.out.println("token --->>> extractClaims ... " + token);
        // Check if the token is well-formed
        String[] parts = token.split("\\.");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid token format");
        }

        System.out.println("Header: " + parts[0]);
        System.out.println("Payload: " + parts[1]);
        System.out.println("Signature: " + parts[2]);

        return Jwts.parserBuilder().setSigningKey(secretKey)  // Use the same key to validate the JWT
                .build().parseClaimsJws(token).getBody();  // Parse and extract claims from the JWT
    }

    // Extract the username from the JWT token
    public String extractUsername(String token) {
        System.out.println("token --->>> extractUsername ... " + token);
        return extractClaims(token).getSubject();
//        return "user";
    }

    // Check if the token is expired
    public boolean isTokenExpired(String token) {
        System.out.println("token --->>> isTokenExpired ... " + token);
        return extractClaims(token).getExpiration().before(new Date());
//        return true;
    }

    // Validate the token with the username
    public boolean validateToken(String token, String username) {
        return (username.equals(extractUsername(token)) && !isTokenExpired(token));
    }
}
*/
