package br.edu.unifio.ecommerce_backend.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Categoria {
    private Short id;
    private String nome;
    private String descricao;

}
