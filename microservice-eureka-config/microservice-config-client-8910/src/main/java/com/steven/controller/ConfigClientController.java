package com.steven.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @Description 
 * @author Steven
 * @date 2020年2月9日 下午7:06:07
 */
@RestController
@RefreshScope		//开启动态刷新
public class ConfigClientController {

	@Value("${port}")
	private String port;

	@RequestMapping("getPort")
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
}
