package cn.kr.admincenteradmin.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdmincenterAdminCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmincenterAdminCustomerApplication.class, args);
	}
}
