package site.shopping.mall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
@SpringBootApplication
public class MallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallApplication.class, args);
	}

	// 스프링서버가 최초 실행될 때 단 한번 실행되는 배치 메서드이다. dev 모드일때만 작동한다.
	@Profile("dev")
	@Bean
	public CommandLineRunner initData1() {
		return (args) -> {
			System.out.println("Dev CommandLineRunner 실행됨 ------------------------------------------");
		};
	}

	// 스프링서버가 최초 실행될 때 단 한번 실행되는 배치 메서드이다. prod 모드일때만 작동한다.
	@Profile("prod")
	@Bean
	public CommandLineRunner initData3() {
		return (args) -> {
			System.out.println("Prod CommandLineRunner 실행됨 ------------------------------------------");
		};
	}

}
