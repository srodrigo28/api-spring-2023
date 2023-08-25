package com.loiane.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.loiane.crudspring.models.Course;
import com.loiane.crudspring.models.Produto;
import com.loiane.crudspring.repository.CourseRepository;
import com.loiane.crudspring.repository.ProdutoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll();

			Course cursos1 = new Course();

			cursos1.setName("Angular com Spring 6");
			cursos1.setCategory("Front-end");
			
			courseRepository.save(cursos1);
		};
	}

	@Bean
	CommandLineRunner initDatabase2(ProdutoRepository produtoRepository){
			return args -> {
			produtoRepository.deleteAll();

			Produto produto1 = new Produto();
			Produto produto2 = new Produto();
			Produto produto3 = new Produto();

			produto1.setNome("Notebook Lenovo");
			produto1.setDescricao("Core i3, 16GB ram, SSD 512GB");
			produto1.setQuantidade(2);
			produto1.setValor(3700);

			produto2.setNome("Notebook Dell");
			produto2.setDescricao("Core i5, 16GB ram, SSD 512GB");
			produto2.setQuantidade(2);
			produto2.setValor(4700);

			produto3.setNome("Computador Gamer Dell");
			produto3.setDescricao("Core i7, 16GB ram, SSD 512GB");
			produto3.setQuantidade(2);
			produto3.setValor(6000);

			produtoRepository.save(produto1);
			produtoRepository.save(produto2);
			produtoRepository.save(produto3);
		};
	}

}
