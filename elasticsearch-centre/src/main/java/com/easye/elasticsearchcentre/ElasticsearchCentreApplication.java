package com.easye.elasticsearchcentre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ElasticsearchCentreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchCentreApplication.class, args);
    }

}
