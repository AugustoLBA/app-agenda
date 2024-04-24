package com.appagenda.service;

import com.appagenda.dto.ContatoDTO;
import com.appagenda.dto.ContatoResponseDTO;
import com.appagenda.entity.Contato;
import com.appagenda.exception.EntityNotFoundException;
import com.appagenda.repository.ContatoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository repository;


    // METODOS DO CRUD DA ENTIDADE CONTATO
    public void salvarContato(Contato contato) {
        repository.save(contato);
    }

    public List<Contato> listarContatos() {
        List<Contato> contatos = repository.findAll();
        return contatos;
    }

    public Contato buscarContatoId(Long id) throws EntityNotFoundException {
        Optional<Contato> contato = repository.findById(id);
        if (!contato.isPresent())
            throw new EntityNotFoundException("Id invalido!");
        return contato.get();
    }

    public boolean atualizarContato(Long id, Contato contato) throws EntityNotFoundException {
        try {
            Contato aux = buscarContatoId(id);
            aux.setNome(contato.getNome());
            aux.setNumero(contato.getNumero());
            repository.save(aux);
            return true;
        } catch (EntityNotFoundException ex) {
            throw new EntityNotFoundException(ex.getMessage());
        }
    }

    public boolean deletarContatoId(Long id) throws EntityNotFoundException {
        try {
            buscarContatoId(id);
            repository.deleteById(id);
            return true;
        } catch (EntityNotFoundException ex) {
            throw new EntityNotFoundException(ex.getMessage());
        }

    }
    // METODOS UTILS PARA CONVERÇÃO DE CONTATO PARA OS DTO'S

    //Metodo que converte um contatoDTO para um contato
    public Contato toContato(ContatoDTO contatoDTO) {
        Contato contato = new Contato();
        BeanUtils.copyProperties(contatoDTO, contato);
        return contato;
    }

    // Metodo que converte um Contato para um ContatoResponseDTO
    public ContatoResponseDTO toContatoResponseDto(Contato contato) {
        ContatoResponseDTO contatoResponseDTO = new ContatoResponseDTO();
        BeanUtils.copyProperties(contato, contatoResponseDTO);
        return contatoResponseDTO;
    }

    // Metodo que retorna uma lista de ContatoResponseDTO
    public List<ContatoResponseDTO> toListDto(List<Contato> contatos) {
        // Basicamente esse método pega cada contato da lista de contato
        // e transforma em um contatoResponseDto e adiciona em uma lista
        // de contatoResponseDto.
        return contatos.stream().map(contato -> toContatoResponseDto(contato)).collect(Collectors.toList());
    }

}
