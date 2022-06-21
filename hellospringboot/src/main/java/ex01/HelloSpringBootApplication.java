package ex01;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 1. 스프링부트 애플리케이션의 부트스트래핑 역할(Bootstrapping Class)
 * 2. 설정 클래스로 역할(Configuration Class)
 *
 */
@SpringBootApplication
public class HelloSpringBootApplication {
	@Bean
	public ApplicationRunner applicationRunner() {
		return new MyComponent();
	}
	
	public static void main(String[] args) {
		/**
		 * SpringApplication.run(...) 안에서 일어나는 일(bootstrap):
		 * 
		 * 
		 * 1. 애플리케이션 컨텍스트(Application Context, Spring Container) 생성 
		 * 2. 만약 웹애플리케이션이면, 웹애플리케이션의 타입을 결정(Spring MVC or Reactive)
		 * 3. 어노테이션 스캐닝(auto) + Configuration Class(Explicity) 통한 빈 생성/등록/와이어링
		 * 4. 만약 웹애플리케이션이면, 웹 애플리케이션(MVC)
		 * 		- 내장(embeded) 서버(TomcatEmbeddedServletContainer) 인스턴스 생성
		 * 		- 서버 인스턴스에 웹 애플리케이션 배포
		 * 		- 서버 인스턴스 실행  
		 * 5. ApplicationRunner 인터페이스를 구현한 빈을 찾아서 실행(run 호출)
		 * 
		 */
//		ConfigurableApplicationContext c = null;
//		try {
//			c = SpringApplication.run(HelloSpringBootApplication.class, args);
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			c.close();
//		}
		
//		try ~ with ~ resource
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloSpringBootApplication.class, args)) {}
	}
}