package com.github.alekseyvideman.SpringAopDemo;

import com.github.alekseyvideman.SpringAopDemo.domain.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopDemoApplication.class, args);
	}

    @Bean
    ApplicationRunner applicationRunner(User user) {
        return args -> {
            user.sayHello();
            user.say("Hello Me from future");
            System.out.println(user.getAge());
        };
    }

}
