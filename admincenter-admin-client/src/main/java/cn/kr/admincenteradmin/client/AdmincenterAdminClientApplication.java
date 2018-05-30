package cn.kr.admincenteradmin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdmincenterAdminClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmincenterAdminClientApplication.class, args);
	}
}
