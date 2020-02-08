package com.steven.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.steven.dao.StudentDao;
import com.steven.entity.Student;
import com.steven.service.StudentService;

/**
 * 
 * @Description 学生服务实现类
 * @author Steven
 * @date 2020年2月3日 下午8:02:26
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentDao studentDao;
	
	public void save(Student stu) {
		studentDao.save(stu);
	}

	public void delete(int id) {
		studentDao.delete(id);
	}

	public List<Student> findAll() {
		return studentDao.findAll();
	}

	public Student findById(int id) {
		return studentDao.findOne(id);
	}

}
