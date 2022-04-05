package namsic.be.spring.websocket;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class McbeSpringWebsocketProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(McbeSpringWebsocketProjectApplication.class, args);
	}
	
	@Bean
	JPAQueryFactory jpaQueryFactory(EntityManager entityManager) {
		return new JPAQueryFactory(entityManager);
	}
	
}
