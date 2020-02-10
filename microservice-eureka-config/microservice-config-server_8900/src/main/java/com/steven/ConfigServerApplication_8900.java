package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * '
 * @Description SpringCloud Config服务端启动类
 * @author Steven
 * @date 2020年2月9日 下午4:56:57
 */
@SpringBootApplication
@EnableConfigServer		//启动Config服务器
public class ConfigServerApplication_8900 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication_8900.class, args);
	}
}
