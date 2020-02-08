package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 
 * @Description DashBoard启动类
 * @author Steven
 * @date 2020年2月7日 下午1:14:56
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableHystrixDashboard		//启动DashBoard
public class StudentConsumerDashboardApplication_90 {

	public static void main(String[] args) {
		SpringApplication.run(StudentConsumerDashboardApplication_90.class, args);
	}

}
