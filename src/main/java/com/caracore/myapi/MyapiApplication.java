package com.caracore.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caracore.myapi.domain.Usuario;
import com.caracore.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u01 = new Usuario(null, "Christian Mulato", "chmulato", "1234");
		Usuario u02 = new Usuario(null, "Pedro da Silva", "pedro", "1234");
		
		usuarioRepository.saveAll(Arrays.asList(u01, u02));
	}

}
