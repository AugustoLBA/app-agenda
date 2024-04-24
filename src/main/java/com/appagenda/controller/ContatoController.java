package com.appagenda.controller;

import com.appagenda.dto.ContatoDTO;
import com.appagenda.dto.ContatoResponseDTO;
import com.appagenda.entity.Contato;
import com.appagenda.service.ContatoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ContatoController {

    @Autowired
    private ContatoService service;

    public void saveContato(@Valid ContatoDTO contatoDTO){
        Contato contato = service.toContato(contatoDTO);
        service.salvarContato(contato);
    }

    public List<ContatoResponseDTO> findAll(){
        return service.toListDto(service.listarContatos());
    }
}
