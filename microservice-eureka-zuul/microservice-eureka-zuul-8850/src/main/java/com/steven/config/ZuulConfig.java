package com.steven.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.steven.filter.AccessFilter;

/**
 * 
 * @Description Zuul网关配置
 * @author Steven
 * @date 2020年2月8日 下午4:11:28
 */
@Configuration
public class ZuulConfig {

	@Bean
	public AccessFilter getAccessFilter() {
		return new AccessFilter();
	}
}
