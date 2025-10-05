package br.com.alura.alura_sons;

import br.com.alura.alura_sons.principal.Principal;
import br.com.alura.alura_sons.repository.ArtistaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class alura_sons_Application implements CommandLineRunner {
	@Autowired
	private ArtistaRepositorio repositorio;

	public static void main(String[] args) {
		SpringApplication.run(alura_sons_Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
