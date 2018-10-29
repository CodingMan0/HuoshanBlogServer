package com.HuoShanBlog.HuoShanBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HuoShanBlogApplication {

	public static void main(String[] args) {
		System.out.print("tttt");
		SpringApplication.run(HuoShanBlogApplication.class, args);
	}
}
