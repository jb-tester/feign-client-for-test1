package com.mytests.spring.feigh.feignclientfortest1;

import com.mytests.spring.feigh.feignclientfortest1.clients.SimpleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientForTest1Application implements CommandLineRunner {

    @Autowired
    private SimpleClient simpleClient;


    public static void main(String[] args) {
        SpringApplication.run(FeignClientForTest1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(simpleClient.home());
        System.out.println(simpleClient.greeting("irina"));

    }
}
