package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class alunoModalidade {

    @Id
    @OneToOne
    @JoinColumn(name = "idAlunoModalidade", referencedColumnName = "idAluno")
    private aluno aluno;

    @NotEmpty
    private Date dataCadastro;

    @ManyToMany
    @JoinTable(name = "idAlunoModalidadePersonal", joinColumns = @JoinColumn(name="idAlunoModalidadePersonal"),
            inverseJoinColumns = @JoinColumn(name = "idPersonalModalidade"))
    private List<personalModalidade> personalModalidade;

    @ManyToMany
    @JoinTable(name = "idAlunoModalidadeModalidade", joinColumns = @JoinColumn(name = "idAlunoModalidadeModalidade"),
            inverseJoinColumns = @JoinColumn(name = "idModalidadePersonal"))
    private List<personalModalidade> personalModalidades;

    @ManyToMany
    @JoinTable(name = "idHorarioAlunoModalidade", joinColumns = @JoinColumn(name = "idHorarioAlunoModalidade"),
            inverseJoinColumns = @JoinColumn(name = "idHorario"))
    private List<horario> horario;

    @ManyToMany
    @JoinTable(name = "idAvaliacaoAlunoModalidade", joinColumns = @JoinColumn(name = "idAvaliacaoAlunoModalidade"),
            inverseJoinColumns = @JoinColumn(name = "idAvalicao"))
    private List<avaliacao> avaliacao;

    @ManyToMany(mappedBy = "alunoModalidadess")
    private List<avaliacao> avaliacaos;

    @ManyToMany(mappedBy = "alunoModalidades")
    private List<avaliacao> avaliacaoss;

    @ManyToMany(mappedBy = "alunoModalidade")
    private List<avaliacao> avaliacaosss;

}
