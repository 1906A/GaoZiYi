package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LyUploadAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(LyUploadAppliaction.class,args);
    }
}
