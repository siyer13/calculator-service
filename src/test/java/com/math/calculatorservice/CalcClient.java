package com.math.calculatorservice;

import io.cucumber.spring.CucumberTestContext;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CalcClient {

    private final String URL = "http://localhost";
    private final String ENDPOINT = "/calc/add";

    @LocalServerPort
    private int port;
    private final RestTemplate restTemplate = new RestTemplate();

    private String getEndpoint() {
        return URL + ":" + port + ENDPOINT;
    }

    public int getAddition(int a, int b) {

        String url = getEndpoint() + "/" + a + "/" + b;
        return restTemplate.postForObject(url, null, Integer.class);
    }
}
