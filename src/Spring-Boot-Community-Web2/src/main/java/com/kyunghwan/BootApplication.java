package com.kyunghwan;

import com.kyunghwan.domain.Board;
import com.kyunghwan.domain.User;
import com.kyunghwan.domain.enums.BoardType;
import com.kyunghwan.repository.BoardRepository;
import com.kyunghwan.repository.UserRepository;
import com.kyunghwan.resolver.UserArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
public class BootApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

	@Autowired
	private UserArgumentResolver userArgumentResolver;

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(userArgumentResolver);
	}

	@Bean
	public CommandLineRunner runner(UserRepository userRepository, BoardRepository boardRepository) throws Exception {
		return args -> {
			User user = userRepository.save(User.builder()
					.name("havi")
					.password("바꾼 비밀번호")
					.email("havi@gmail.com")
					.createdDate(LocalDateTime.now())
					.build());

			IntStream.rangeClosed(1, 200).forEach(index -> {
				boardRepository.save(Board.builder()
						.title("게시글"+index)
						.subTitle("순서"+index)
						.content("바꾼 콘텐트"+index)
						.boardType(BoardType.free)
						.createdDate(LocalDateTime.now())
						.updatedDate(LocalDateTime.now())
						.user(user).build());
			});
		};
	}
}
