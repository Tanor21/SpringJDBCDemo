package com.norcorp.SpringJDBCDemo;

import com.norcorp.SpringJDBCDemo.model.Alien;
import com.norcorp.SpringJDBCDemo.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Alien a1 = context.getBean(Alien.class);
		a1.setId(111);
		a1.setName("Tanor");
		a1.setTech("Java");


		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(a1);

		System.out.println(repo.findAll());



	}

}
