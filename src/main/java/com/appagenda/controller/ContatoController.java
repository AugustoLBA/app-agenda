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
    public ContatoResponseDTO findById(Long id){
        return service.toContatoResponseDto(service.buscarContatoId(id));
    }

    public boolean updateContato(@Valid Long id, ContatoDTO contatoDTO){
        return service.atualizarContato(id,service.toContato(contatoDTO));
    }

    public boolean deleteById(Long id){
        return service.deletarContatoId(id);
    }
}
