package com.spring.MLproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PredictionController {

    private final WebClient webClient = WebClient.create("http://localhost:5000");

    @PostMapping("/predict")
    public ResponseEntity<?> predict(@RequestBody PredictionRequest request) {
        Map<String, Object> response = webClient.post()
                .uri("/predict")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(Map.class)
                .block();

        return ResponseEntity.ok(response);
    }
}
