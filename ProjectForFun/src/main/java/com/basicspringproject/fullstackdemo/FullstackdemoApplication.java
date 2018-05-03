package com.basicspringproject.fullstackdemo;

import com.basicspringproject.fullstackdemo.dao.UserDao;
import com.basicspringproject.fullstackdemo.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FullstackdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackdemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(UserDao repo) {
		User user = new User();
		user.setId(1);
		user.setEmail("123abc@gmail.com");
		user.setPassword("abc123");
		user.setCity("hobo");
		user.setPhone("123-456-777");
		user.setRole(1);
		user.setState("NY");
		user.setZip(12346);
		user.setStreet("12 hb st");

		repo.save(user);

		return (args) -> {
			for (User usr : repo.findAll()) {
				System.out.println(usr.toString());
			}
		};
	}
}
