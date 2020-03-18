package com.mytests.spring.feigh.feignclientfortest1.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "test1SimpleClient", url = "localhost:8081/rest-api-test1/simple")
public interface SimpleClient {

    @GetMapping("/")
    String home();
    @GetMapping("greetings/{guest_name}")
    String greeting(@PathVariable String guest_name);

    @GetMapping("/foo/{bar}")
    String foobar();

}
