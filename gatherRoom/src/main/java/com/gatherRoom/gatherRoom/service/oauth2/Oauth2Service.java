package com.gatherRoom.gatherRoom.service.oauth2;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class Oauth2Service {
    private final HttpServletResponse response;

    @Value("${spring.security.oauth2.client.registration.google.client-id}")
    private String clientId;
    @Value("${spring.security.oauth2.client.registration.google.client-secret}")
    private String clientSecret;
    @Value("${spring.security.oauth2.client.registration.google.redirectUri}")
    private String redirectUri;
    @Value("${spring.security.oauth2.client.registration.google.scope}")
    private String scope;

    public void request() throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("clientId", clientId);
        params.put("clientSecret", clientSecret);
        params.put("redirectUri", redirectUri);
        params.put("scope", scope);

        String parameterString = params.entrySet().stream()
                .map(x -> x.getKey() + "=" + x.getValue())
                .collect(Collectors.joining("&"));

        response.sendRedirect(redirectUri + "?" + parameterString);
    }
}
