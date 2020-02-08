package com.steven.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.steven.service.StudentService;

/**
 * 
 * @Description 服务提供者--学生信息控制器
 * @author Steven
 * @date 2020年2月3日 下午8:06:25
 */
@RestController
@RequestMapping("/student")
public class StudentProviderController {

	@Autowired
	private StudentService studentService;
	
	/**
	 * 
	 * @Description  测试Hystrix服务熔断服务降级
	 * @Tips  
	 * @return
	 * @throws InterruptedException
	 */
	@RequestMapping("/getInfo")
	@ResponseBody
	public Map<String, Object> getInfo() throws InterruptedException{
		Thread.sleep(500);
	    return studentService.getInfo();
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
	public Map<String, Object> getInfo2() throws InterruptedException{
		Thread.sleep(3000);
		return studentService.getInfo2();
	}
	
}
