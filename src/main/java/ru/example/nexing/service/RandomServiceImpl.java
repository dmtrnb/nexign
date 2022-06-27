package ru.example.nexing.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Primary
@Service
public class RandomServiceImpl implements RandomService {

    private final RestTemplate restTemplate = new RestTemplate();
    @Value("${custom.random.url}")
    private String url;

    @Override
    public long getWinning(long min, long max) {
        Map<String, Long> vars = getArgs(min, max);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class, vars);
        return Long.parseLong(Objects.requireNonNull(response.getBody()).trim());
    }

    private Map<String, Long> getArgs(long min, long max) {
        Map<String, Long> vars = new HashMap<>();
        vars.put("min", min);
        vars.put("max", max);
        return vars;
    }
}
