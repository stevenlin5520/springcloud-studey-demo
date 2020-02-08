package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 
 * @Description 集群监控Turbine启动类
 * @author Steven
 * @date 2020年2月7日 下午1:33:12
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableTurbine	//启动Turbine
public class StudentConsumerTurbineApplication_91 {

	public static void main(String[] args) {
		SpringApplication.run(StudentConsumerTurbineApplication_91.class, args);
	}

}
