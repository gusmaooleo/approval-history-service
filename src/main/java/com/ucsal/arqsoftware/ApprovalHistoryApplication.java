package com.ucsal.arqsoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ApprovalHistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprovalHistoryApplication.class, args);
	}

}
