package com.mhp.Internship;

import com.mhp.Internship.demo.service.component.MessagingComponent;
import com.mhp.Internship.demo.service.component.ProdComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InternshipApplication {

	public static void main(String[] args) {

		 SpringApplication.run(InternshipApplication.class, args);

		//MessagingComponent component = (MessagingComponent) context.getBean("messagingComponent");
		//component.displayMessage();

		//ProdComponent prodComponent=(ProdComponent) context.getBean("prodComponent");
		//System.out.println(prodComponent.getMessage());
	}

}
