package com.example.demo;

import com.example.demo.entity.Setor;
import com.example.demo.repository.FuncionarioRepository;
import com.example.demo.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java2JpaApplication implements CommandLineRunner {

	@Autowired
	private SetorRepository setorRepository;

	private FuncionarioRepository funcionarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(Java2JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Cadastrar

		//Setor setor = new Setor();
		//setor.setNome("TI");
		//setorRepository.saveAndFlush(setor);
		//System.out.println("Cadastro efetuado com sucesso");

		//Consultar

		//System.out.println("Setores cadastrados: \n\n");
		//for(Setor setor1 : setorRepository.findAll()){
			//System.out.println(setor1.getNome());
		//}

		//Buscar
		//Setor setor = setorRepository.findById(1L).get();
		//System.out.println(setor.getNome());

		//Alterar
		//setor.setNome("Financeiro");
		//setorRepository.saveAndFlush(setor);

		//Deletar
		//Setor setor = setorRepository.findById(4L).get();
		//setorRepository.delete(setor);
	}
}
