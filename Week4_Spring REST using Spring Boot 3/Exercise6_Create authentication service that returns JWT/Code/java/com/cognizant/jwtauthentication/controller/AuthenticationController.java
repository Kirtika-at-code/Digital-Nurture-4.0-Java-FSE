package com.cognizant.jwtauthentication.controller;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
@Slf4j
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        log.info("Start authenticate()");
        log.debug("Authorization header: {}", authHeader);

        String user = getUser(authHeader);

        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        log.info("End authenticate()");
        return map;
    }

    private String getUser(String authHeader) {
        String encoded = authHeader.substring("Basic ".length());
        String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
        log.debug("Decoded credentials: {}", decoded);
        return decoded.split(":")[0];
    }

    private String generateJwt(String user) {
        String secretKey = "mysecretkeymysecretkeymysecretkey12"; // ≥ 32 chars
        Key key = Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));

        return Jwts.builder()
                .setSubject(user)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
