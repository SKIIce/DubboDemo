package com.example.demodubboprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jmx.support.RegistrationPolicy;

@SpringBootApplication
@EnableDubboConfiguration
@EnableJpaRepositories(basePackages = "com.example.dao")
@EntityScan("com.example.demain")
public class DemoDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDubboProviderApplication.class, args);
	}
}
