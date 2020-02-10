package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @Description Config整合的Eureka服务器
 * @author Steven
 * @date 2020年2月10日 下午12:56:56
 */
@SpringBootApplication
@EnableEurekaServer		//启动Eureka服务器
public class ConfigEurekaApplication_8920 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEurekaApplication_8920.class, args);
	}
}
