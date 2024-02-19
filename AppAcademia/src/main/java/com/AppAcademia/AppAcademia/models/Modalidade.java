package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idModalidade;

    @NotEmpty
    private String modalidadeNome;

    @NotEmpty
    private String modalidadeDescricao;

    @NotEmpty
    private float modalidadePreco;

}
