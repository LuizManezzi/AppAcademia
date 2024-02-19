package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class AlunoModalidade {

    @Id
    @OneToOne
    @JoinColumn(name = "alunoModalidadeIdAluno", referencedColumnName = "idAluno")
    private Aluno aluno;

    @NotEmpty
    private Date dataCadastro;

    @Id
    @OneToOne
    @JoinColumn(name = "alunoModalidadeIdPersonal", referencedColumnName = "PersonalIdPersonal")
    private PersonalModalidade personalModalidade;

    @Id
    @OneToOne
    @JoinColumn(name = "alunoModalidadeIdModalidade", referencedColumnName = "PersonalIdModalidade")
    private PersonalModalidade personalModalidade2;

    @Id
    @OneToOne
    @JoinColumn(name = "AlunoModalidadeIdHorario", referencedColumnName = "idHorario")
    private Horario horario;
}
