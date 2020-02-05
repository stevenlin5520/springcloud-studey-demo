package com.steven.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steven.entity.Student;

/**
 * 
 * @Description Student Feign接口客户端
 * @author Steven
 * @date 2020年2月5日 下午4:12:35
 */
@FeignClient("MICROSERVICE-EUREKA-STUDENT")
public interface StudentClientService {

	/**
	 * 
	 * @Description 添加或者修改学生信息
	 * @param stu
	 * @return
	 */
	@RequestMapping("/student/save")
	public boolean save(Student stu) ;
	
	
	/**
	 * 
	 * @Description 根据id删除学生信息
	 * @param id
	 * @return
	 */
	@GetMapping("/student/delete/{id}")
	public boolean delete(@PathVariable("id")Integer id);
	
	/**
	 * 
	 * @Description 查询全部学生信息
	 * @return
	 */
	@RequestMapping("/student/list")
	public List<Student> list();
	
	/**
	 * 
	 * @Description 根据Id查询学生信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/student/listone/{id}")
	public Student list(@PathVariable("id") Integer id);
	
}
