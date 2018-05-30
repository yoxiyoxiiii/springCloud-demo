package kr.cn.admincenter.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class AdmincenterAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmincenterAdminApplication.class, args);
	}
}
