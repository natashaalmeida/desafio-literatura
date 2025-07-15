package com.alura.literatura;

import com.alura.literatura.mainApp.MainApp;
import com.alura.literatura.repository.AuthorRepository;
import com.alura.literatura.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private BooksRepository booksRepository;


	@Override
	public void run(String... args) throws Exception {
		MainApp mainRun =new MainApp(authorRepository,booksRepository);
		mainRun.showMenu();


	}
}
