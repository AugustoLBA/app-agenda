package com.appagenda.service;

import com.appagenda.dto.ContatoDTO;
import com.appagenda.dto.ContatoResponseDTO;
import com.appagenda.entity.Contato;
import com.appagenda.repository.ContatoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository repository;


    // METODOS DO CRUD DA ENTIDADE CONTATO
    public void salvarContato(Contato contato){
        repository.save(contato);
    }

    public List<Contato> listarContatos(){
        List<Contato> contatos = repository.findAll();
        return contatos;
    }
    public Contato buscarContatoId(Long id){
        Optional<Contato> contato = repository.findById(id);
        return contato.get();
    }
    public boolean atualizarContato(Long id, Contato contato){
        Contato contatoAux = buscarContatoId(id);
        if(contatoAux != null){
            contatoAux.setNome(contato.getNome());
            contatoAux.setNumero(contato.getNumero());
            repository.save(contatoAux);
            return true;
        }
        return false;
    }
    public boolean deletarContatoId(Long id){
        try {
            repository.deleteById(id);
            return true;
        }catch (RuntimeException ex){
            return false;
        }
    }
    // METODOS UTILS PARA CONVERÇÃO DE CONTATO PARA OS DTO'S

    //Metodo que converte um contatoDTO para um contato
    public Contato toContato(ContatoDTO contatoDTO){
        Contato contato = new Contato();
        BeanUtils.copyProperties(contatoDTO,contato);
        return contato;
    }

    // Metodo que converte um Contato para um ContatoResponseDTO
    public ContatoResponseDTO toContatoResponseDto(Contato contato){
        ContatoResponseDTO contatoResponseDTO = new ContatoResponseDTO();
        BeanUtils.copyProperties(contato, contatoResponseDTO);
        return contatoResponseDTO;
    }

}
