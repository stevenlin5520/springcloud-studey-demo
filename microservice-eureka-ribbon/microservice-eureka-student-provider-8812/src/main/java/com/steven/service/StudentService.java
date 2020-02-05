package com.steven.service;

import java.util.List;

import com.steven.entity.Student;

/**
 * 
 * @Description 学生服务接口层
 * @author Steven
 * @date 2020年2月3日 下午7:58:25
 */
public interface StudentService {

	/**
	 * 
	 * @Description 添加或修改学生信息
	 * @param stu
	 */
	public void save(Student stu);
	
	/**
	 * 
	 * @Description 删除学生
	 * @param id
	 */
	public void delete(int id);
	
	
	/**
	 * 	
	 * @Description 查询全部学生
	 * @return
	 */
	public List<Student> findAll();
	
	/**
	 * 
	 * @Description 根据ID查询学生
	 * @param id
	 * @return
	 */
	public Student findById(int id);
}
