package com.steven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steven.entity.Student;
import com.steven.service.StudentClientService;


/**
 * 
 * @Description 服务消费者--学生信息控制器
 * @author Steven
 * @date 2020年2月3日 下午8:57:18
 */
@RestController
@RequestMapping("/student")
public class StudentConsumerController {

	@Autowired
	private StudentClientService studentClientService;
	
	/**
	 * 
	 * @Description 添加或者修改学生信息
	 * @param stu
	 * @return
	 */
	@RequestMapping("/save")
	public boolean save(Student stu) {
		return studentClientService.save(stu);
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
			studentClientService.delete(id);
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
		return studentClientService.list();
	}
	
	/**
	 * 
	 * @Description 根据Id查询学生信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/listone/{id}")
	public Student list(@PathVariable("id") Integer id){
		return studentClientService.list(id);
	}
	
}
