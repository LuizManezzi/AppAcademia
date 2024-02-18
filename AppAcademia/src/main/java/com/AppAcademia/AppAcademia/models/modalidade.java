package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

// import javax.validation.constrains.NotEmpty;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idModalidade;

    @NotEmpty
    private String modalidadeNome;

    @NotEmpty
    private String modalidadeDescricao;

    @NotEmpty
    private float modalidadePreco;

    @ManyToMany(mappedBy = "modalidades")
    private List<modalidade> modalidades;

    @ManyToMany(mappedBy = "modalidade")
    private List<pagamentoModalidade> pagamentoModalidades;
}
