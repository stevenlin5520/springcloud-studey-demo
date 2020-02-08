package com.steven.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.steven.entity.Student;

/**
 * 学生Dao层接口
 * @Description 
 * @author Steven
 * @date 2020年2月3日 下午7:57:04
 */
public interface StudentDao extends JpaRepository<Student, Integer>,JpaSpecificationExecutor<Student> {

}
