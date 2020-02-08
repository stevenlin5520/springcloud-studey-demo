package com.steven.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 
 * @Description 服务提供者--学生信息控制器
 * @author Steven
 * @date 2020年2月3日 下午8:06:25
 */
@RestController
@RequestMapping("/student")
public class StudentProviderController {

		
	/**
	 * 
	 * @Description  测试Hystrix服务熔断服务降级
	 * @Tips  
	 * @return
	 * @throws InterruptedException
	 */
	@RequestMapping("/getInfo")
	@ResponseBody
	@HystrixCommand(fallbackMethod="getInfoFallback")
	public Map<String, Object> getInfo() throws InterruptedException{
		Thread.sleep(500);
	    Map<String,Object> map=new HashMap<String,Object>();
	    map.put("code", 200);
	    map.put("info", "业务数据xxxxx正常测试-----------------------8820");
	    return map;
	}
	
	
	/**
	 * 
	 * @Description  测试Hystrix服务熔断服务降级
	 * @Tips  
	 * @return
	 * @throws InterruptedException
	 */
	@RequestMapping("/getInfo2")
	@ResponseBody
	@HystrixCommand(fallbackMethod="getInfoFallback")
	public Map<String, Object> getInfo2() throws InterruptedException{
		Thread.sleep(3000);
	    Map<String,Object> map=new HashMap<String,Object>();
	    map.put("code", 200);
	    map.put("info", "业务数据xxxxx超时测试-----------------------8820");
	    return map;
	}
	
	
	/**
	 * 
	 * @Description  Hystrix请求错误、超时等执行此方法。有效的解决雪崩效应，以及返回给用户界面很好的报错提示信息
	 * @Tips  
	 * @return
	 * @throws InterruptedException
	 */
	public Map<String,Object> getInfoFallback() throws InterruptedException{
	    Map<String,Object> map=new HashMap<String,Object>();
	    map.put("code", 500);
	    map.put("info", "系统出错，稍后重试---------------------8820");
	    return map;
	}
}
