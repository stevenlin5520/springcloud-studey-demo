package com.steven.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @Description SpringCloud相关配置 
 * 主要是定义一个bean RestTemplate对象； springcloud消费者，服务提供者之间的交互是http rest方式，比dubbo rpc方式更加灵活方便点
 * @author Steven
 * @date 2020年2月3日 下午8:53:29
 */
@Configuration
public class SpringCloudConfig {

	/**
	 * 
	 * @Description 调用服务模板
	 * @return
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
}
