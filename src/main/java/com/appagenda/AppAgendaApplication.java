package com.appagenda;

import com.appagenda.controller.ContatoController;
import com.appagenda.dto.ContatoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppAgendaApplication implements CommandLineRunner {
	@Autowired
	private ContatoController controller;

	public static void main(String[] args) {
		SpringApplication.run(AppAgendaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ContatoResponseDTO dto = controller.findById(8L);
		System.out.println(dto.toString());
	}
}
