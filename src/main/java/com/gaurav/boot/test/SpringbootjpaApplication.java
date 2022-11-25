package com.gaurav.boot.test;

import com.gaurav.boot.test.dao.UserRepository;
import com.gaurav.boot.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootjpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user2=new User();
		user2.setId(34);
		user2.setName("Lakita");
		user2.setCity("Indore");

		User user3=new User();
		user3.setId(34);
		user3.setName("Kavita");
		user3.setCity("Indore");



//		List<User> users = List.of(user2,user3);
//		//Iterable<User> result = userRepository.saveAll(users);
//		List<User> user = userRepository.findByName("Lakita");
//		user.forEach(e -> System.out.println(e));
//
//		List<User> user4 = userRepository.findByNameAndId("Lakita",4);    //Derived Query
//		System.out.println(user4);
//		result.forEach(user -> {
//			System.out.println(user);
//		});
//		for (User u: userList)
//		{
//			System.out.println("User id is :" + u.getId() + " name is " + u.getName() +" and city is : "+ u.getCity());
//		}
		//userRepository.deleteById(1);
		//userRepository.save(user);
		//System.out.println(user);



		//JPQL Query implementation
		List<User> users = userRepository.getAllUser();
		users.forEach(user -> {
			System.out.println(user);
		});
	}

}
