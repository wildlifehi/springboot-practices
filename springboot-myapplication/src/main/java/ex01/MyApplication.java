package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplication {
	
	@Bean
	public MyComponent myComponent() {
		return new MyComponent;
	}
	
	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloSpringBootApplication.class, args)) {}
		
	}

}
