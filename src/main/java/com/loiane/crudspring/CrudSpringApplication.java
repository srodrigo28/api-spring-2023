package com.loiane.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.loiane.crudspring.models.Condominio;
import com.loiane.crudspring.models.Course;
import com.loiane.crudspring.models.Membro;
import com.loiane.crudspring.models.Produto;
import com.loiane.crudspring.repository.CondominioRepository;
import com.loiane.crudspring.repository.CourseRepository;
import com.loiane.crudspring.repository.MembroRepository;
import com.loiane.crudspring.repository.ProdutoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean // Cursos
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course cursos1 = new Course();

			cursos1.setName("Angular com Spring 6");
			cursos1.setCategory("Front-end");

			courseRepository.save(cursos1);
		};
	}
	
	@Bean // Produtos
	CommandLineRunner initDatabase2(ProdutoRepository produtoRepository) {
		return args -> {
			produtoRepository.deleteAll();

			Produto produto1 = new Produto();
			Produto produto2 = new Produto();
			Produto produto3 = new Produto();

			produto1.setNome("Notebook Lenovo");
			produto1.setDescricao("Core i3, 16GB ram, SSD 512GB");
			produto1.setQuantidade(10);
			produto1.setValor(3700);

			produto2.setNome("Notebook Dell");
			produto2.setDescricao("Core i5, 16GB ram, SSD 512GB");
			produto2.setQuantidade(15);
			produto2.setValor(4700);

			produto3.setNome("Computador Gamer Dell");
			produto3.setDescricao("Core i7, 16GB ram, SSD 512GB");
			produto3.setQuantidade(18);
			produto3.setValor(6000);

			produtoRepository.save(produto1);
			produtoRepository.save(produto2);
			produtoRepository.save(produto3);
		};
	}
	
	@Bean // Membros
	CommandLineRunner initDatabase3(MembroRepository membroRepository) {
		return args -> {
			membroRepository.deleteAll();

			Membro m1 = new Membro();
			Membro m2 = new Membro();
			Membro m3 = new Membro();

			m1.setNome("Aline Oliveira");
			m1.setTelefone("62 9999-8888");

			m2.setNome("Daiane Oliveira");
			m2.setTelefone("62 9999-8889");

			m3.setNome("Danillo Willian");
			m3.setTelefone("62 9899-7788");

			membroRepository.save(m1);
			membroRepository.save(m2);
			membroRepository.save(m3);
		};
	}

	@Bean // Condominio
	CommandLineRunner initDatabase4(CondominioRepository condominioRepository){
		return args -> {
			condominioRepository.deleteAll();

			Condominio cond1 = new Condominio();
			Condominio cond2 = new Condominio();
			Condominio cond3 = new Condominio();

			cond1.setNome("Varandas 2023");
			cond1.setCnpj("00.394.460/0058-87");
			cond1.setCidade("Goiânia");
			cond1.setBairro("Setor Oeste");
			cond1.setEndereco("Av. T-9, N 1026,");
			cond1.setData_inicio("20-02-2023");
			cond1.setValor_contrato(2000f);

			cond2.setNome("Jardim Europa");
			cond2.setCnpj("00.394.460/0058-99");
			cond2.setCidade("Goiânia");
			cond2.setBairro("Setor Oeste");
			cond2.setEndereco("Av. T-4, N 3026,");
			cond2.setData_inicio("20-02-2022");
			cond2.setValor_contrato(3000f);

			cond3.setNome("Nascer do Sol");
			cond3.setCnpj("00.394.460/0058-00");
			cond3.setCidade("Goiânia");
			cond3.setBairro("Marista");
			cond3.setEndereco("Av. T-7, N 1026,");
			cond3.setData_inicio("20-10-2023");
			cond3.setValor_contrato(2500f);

			condominioRepository.save(cond1);
			condominioRepository.save(cond2);
			condominioRepository.save(cond3);
		};
	}
}
