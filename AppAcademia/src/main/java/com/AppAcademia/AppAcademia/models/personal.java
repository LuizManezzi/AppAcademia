package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPersonal;

    @Column(unique = true)
    private String cpf;

    @NotEmpty
    private String nomeProfissional;

    @NotEmpty
    private String sexo;

    @NotEmpty
    private String idade;

    @NotEmpty
    private String telefone;

    @NotEmpty
    @ManyToOne
    @JoinColumn(name = "idModalidade")
    private modalidade alunoModalidade;

    @ManyToMany(mappedBy = "personal")
    private List<personalModalidade> personalModalidadeList;

}
