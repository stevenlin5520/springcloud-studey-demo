package com.steven.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steven.entity.Student;
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

	@Resource
	private StudentService studentService;
	
	/**
	 * 
	 * @Description 添加或者修改学生信息
	 * @Tips 服务提供者为消费者服务时需要在参数表中加@RequestBody注解，因为消费者与提供者之间是通过http请求连接的；若是测试的话不用加注解
	 * @param stu
	 * @return
	 */
	@RequestMapping("/save")
	public boolean save(@RequestBody Student stu) {
		try {
			studentService.save(stu);
			return true;
		} catch (Exception e) {
			return false;
		}
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
			studentService.delete(id);
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
	@RequestMapping("/list")
	public List<Student> list(){
		return studentService.findAll();
	}
	
	/**
	 * 
	 * @Description 根据Id查询学生信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/listone/{id}")
	public Student list(@PathVariable("id") Integer id){
		return studentService.findById(id);
	}
	
}
