package com.appagenda.service;

import com.appagenda.entity.Contato;
import com.appagenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository repository;

    public void salvarContato(Contato contato){
        repository.save(contato);
    }

    public List<Contato> listarContatos(){
        List<Contato> contatos = repository.findAll();
        return contatos;
    }

}
