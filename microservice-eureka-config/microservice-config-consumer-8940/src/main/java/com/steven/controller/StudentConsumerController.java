package com.steven.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.steven.entity.Student;

/**
 * 
 * @Description 服务消费者--学生信息控制器
 * @author Steven
 * @date 2020年2月3日 下午8:57:18
 */
@RestController
@RequestMapping("/student")
public class StudentConsumerController {

	@Resource
	private RestTemplate restTemplate;
	
	/**
	 * 服务提供者地址
	 */
	private final static String PROVIDER_HOST = "http://MICROSERVICE-EUREKA-PROVIDER";
	
	/**
	 * 
	 * @Description 添加或者修改学生信息
	 * @param stu
	 * @return
	 */
	@RequestMapping("/save")
	public boolean save(Student stu) {
		return restTemplate.postForObject(PROVIDER_HOST+"/student/save", stu, Boolean.class);
	}
	
	
	/**
	 * 
	 * @Description 根据id删除学生信息
	 * @param id
	 * @return
	 */
	@GetMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")Integer id) {
		try {
			restTemplate.getForObject(PROVIDER_HOST+"/student/delete/"+id, Boolean.class);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * 
	 * @Description 查询全部学生信息
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/list")
	public List<Student> list(){
		return restTemplate.getForObject(PROVIDER_HOST+"/student/list", List.class);
	}
	
	/**
	 * 
	 * @Description 根据Id查询学生信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/listone/{id}")
	public Student list(@PathVariable("id") Integer id){
		return restTemplate.getForObject(PROVIDER_HOST+"/student/listone/"+id, Student.class);
	}
	
	/**
	 * 
	 * @Description  测试Hystrix服务熔断正常业务
	 * @Tips  
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/getInfo")
	@ResponseBody
	public Map<String,Object> getInfo(){
	    return restTemplate.getForObject(PROVIDER_HOST+"/student/getInfo/", Map.class);
	}
	
	/**
	 * 
	 * @Description  测试Hystrix服务熔断超时业务
	 * @Tips  
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/getInfo2")
	@ResponseBody
	public Map<String,Object> getInfo2(){
		return restTemplate.getForObject(PROVIDER_HOST+"/student/getInfo2/", Map.class);
	}
}
