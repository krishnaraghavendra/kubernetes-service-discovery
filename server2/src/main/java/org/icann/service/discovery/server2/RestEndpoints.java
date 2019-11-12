package org.icann.service.discovery.server2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoints {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public String sayHello() throws UnknownHostException {
        return "Hello From Server 2 "+ InetAddress.getLocalHost().getHostName();
    }
}
