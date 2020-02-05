package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @Description 服务消费者--学生信息消费者；@EnableEurekaClient用于启动服务消费者的Eureka客户端
 * @author Steven
 * @date 2020年2月4日 下午11:56:06
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
public class StudentConsumerApplication_80 {

	public static void main(String[] args) {
		SpringApplication.run(StudentConsumerApplication_80.class, args);
	}
}
