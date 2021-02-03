package org.rain.fabricService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Program: FabricServiceSDK-Web
 * @Description: main application
 * @Author: HouHao Ye
 * @Create: 2021-02-02 22:35
 **/
@SpringBootApplication
@EnableEurekaClient
public class fabricServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(fabricServiceMain.class, args);
    }
}
