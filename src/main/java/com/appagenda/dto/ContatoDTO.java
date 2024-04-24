package com.appagenda.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ContatoDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String numero;
}
