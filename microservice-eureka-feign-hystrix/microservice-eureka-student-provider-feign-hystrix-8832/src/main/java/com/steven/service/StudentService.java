package com.steven.service;

import java.util.Map;

/**
 * 
 * @Description 学生服务接口层
 * @author Steven
 * @date 2020年2月3日 下午7:58:25
 */
public interface StudentService {

	/**
	 * 
	 * @Description  测试Hystrix服务熔断服务降级
	 * @return
	 */
	public Map<String, Object> getInfo();
	
	/**
	 * 
	 * @Description  测试Hystrix服务熔断服务降级
	 * @return
	 */
	public Map<String, Object> getInfo2();
}
