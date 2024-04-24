package com.appagenda.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ContatoDTO {

    @NotBlank(message = "O nome nao pode ser vazio!")
    private String nome;
    @NotBlank(message = "O numero nao pode ser vazio!")
    private String numero;
}
