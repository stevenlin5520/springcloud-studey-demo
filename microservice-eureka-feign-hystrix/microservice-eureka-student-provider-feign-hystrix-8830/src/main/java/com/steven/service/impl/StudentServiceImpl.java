package com.steven.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.steven.service.StudentService;

/**
 * 
 * @Description 学生服务实现类
 * @author Steven
 * @date 2020年2月3日 下午8:02:26
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Override
	public Map<String, Object> getInfo() {
		Map<String,Object> map=new HashMap<String,Object>();
	    map.put("code", 200);
	    map.put("info", "业务数据xxxxx正常测试-----------------------8830");
	    return map;
	}

	@Override
	public Map<String, Object> getInfo2() {
		Map<String,Object> map=new HashMap<String,Object>();
	    map.put("code", 200);
	    map.put("info", "业务数据xxxxx超时测试-----------------------8830");
	    return map;
	}


}
