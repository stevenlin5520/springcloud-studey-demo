package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @Description 学生服务提供者启动类；@EnableEurekaClient用于向Eureka注册中心注册服务
 * @author Steven
 * @date 2020年2月3日 下午8:15:50
 */
@SpringBootApplication
@EnableEurekaClient
public class StudentProviderApplication_8812 {

	public static void main(String[] args) {
		SpringApplication.run(StudentProviderApplication_8812.class, args);
	}
}
