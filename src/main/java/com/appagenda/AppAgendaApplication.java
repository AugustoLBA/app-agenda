package com.appagenda;

import com.appagenda.ui.janelas.JanelaInicial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AppAgendaApplication  {
	@Autowired
	private JanelaInicial janelaInicial;

	public static void main(String[] args) {

		new SpringApplicationBuilder(AppAgendaApplication.class).headless(false)
				.run(args);
	}

}
