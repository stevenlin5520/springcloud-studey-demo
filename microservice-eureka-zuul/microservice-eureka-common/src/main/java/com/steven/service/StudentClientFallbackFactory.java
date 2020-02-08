package com.steven.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.steven.entity.Student;

import feign.hystrix.FallbackFactory;


/**
 * 
 * @Description Hystrix实现服务降级处理类
 * @author Steven
 * @date 2020年2月7日 下午4:41:40
 */
@Component
public class StudentClientFallbackFactory implements FallbackFactory<StudentClientService>{

	@Override
	public StudentClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new StudentClientService() {
			
			@Override
			public boolean save(Student stu) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Student list(Integer id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Student> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			/**
			 * Hystrix请求错误、超时等执行此方法。有效的解决雪崩效应，以及返回给用户界面很好的报错提示信息
			 */
			public Map<String, Object> getInfo2() {
				Map<String,Object> map=new HashMap<String,Object>();
			    map.put("code", 500);
			    map.put("info", "系统出错，稍后重试---------------------");
			    return map;
			}
			
			/**
			 * Hystrix请求错误、超时等执行此方法。有效的解决雪崩效应，以及返回给用户界面很好的报错提示信息
			 */
			public Map<String, Object> getInfo() {
				Map<String,Object> map=new HashMap<String,Object>();
			    map.put("code", 500);
			    map.put("info", "系统出错，稍后重试---------------------");
			    return map;
			}
			
			@Override
			public boolean delete(Integer id) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
