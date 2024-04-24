package com.appagenda;

import com.appagenda.controller.ContatoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppAgendaApplication  {
	@Autowired
	private ContatoController controller;

	public static void main(String[] args) {

		SpringApplication.run(AppAgendaApplication.class, args);
	}

}
