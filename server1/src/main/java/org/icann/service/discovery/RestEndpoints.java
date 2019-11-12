package org.icann.service.discovery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestEndpoints {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    private final RestTemplate restTemplate;

    public RestEndpoints(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("helloService2")
   public String getDeals() {
        return this.restTemplate.getForObject("http://server2:8586/hello", String.class);
    }
}
