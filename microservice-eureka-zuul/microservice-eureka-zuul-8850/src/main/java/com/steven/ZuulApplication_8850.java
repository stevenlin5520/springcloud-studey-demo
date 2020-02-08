package com.steven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @Description Zuul网关启动类
 * @author Steven
 * @date 2020年2月8日 下午3:46:48
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableZuulProxy	//启动Zuul服务
public class ZuulApplication_8850 {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication_8850.class, args);
	}

}
