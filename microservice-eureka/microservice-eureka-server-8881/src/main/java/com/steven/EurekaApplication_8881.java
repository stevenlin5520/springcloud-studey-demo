package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @Description Eureka集群单机。@EnableEurekaServer代表启动的是Eureka服务器
 * @author Steven
 * @date 2020年2月4日 下午3:44:30
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication_8881 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication_8881.class, args);
	}

}
