package com.appagenda.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ContatoResponseDTO {

    private Long id;

    private String nome;

    private String numero;
}
