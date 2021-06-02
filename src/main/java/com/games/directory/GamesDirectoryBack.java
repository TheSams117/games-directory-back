package com.games.directory;

import com.games.directory.model.GameDao;
import com.games.directory.repository.GameRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GamesDirectoryBack {
	public static void main(String[] args) {
		SpringApplication.run(GamesDirectoryBack.class, args);

	}
}
