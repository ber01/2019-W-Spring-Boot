package com.kyunghwan;

import com.kyunghwan.domain.Board;
import com.kyunghwan.domain.User;
import com.kyunghwan.domain.enums.BoardType;
import com.kyunghwan.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {

		SpringApplication.run(BootApplication.class, args);
	}
}

