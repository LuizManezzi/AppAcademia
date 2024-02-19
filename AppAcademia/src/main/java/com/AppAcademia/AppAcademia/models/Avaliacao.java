package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAvaliacao;

    @NotEmpty
    private float avaliacaoPeso;

    @NotEmpty
    private float avaliacaoValorMassaMuscular;

    @NotEmpty
    private Date avaliacaoDataAvaliacao;

    @NotEmpty
    private float avaliacaoTriciptal;

    @NotEmpty
    private float avaliacaoPeitoral;

    @NotEmpty
    private float avaliacaoCintura;

    @NotEmpty
    private float avaliacaoQuadril;

    @NotEmpty
    private float avaliacaoBracoE;

    @NotEmpty
    private float avaliacaoBracoD;

    @NotEmpty
    private float avaliacaoPanturrilha;

    @NotEmpty
    private float avaliacaoAbdmen;

    @Id
    @OneToOne
    @JoinColumn(name = "avaliacaoIdPersonal", referencedColumnName = "alunoModalidadeIdPersonal")
    private AlunoModalidade alunoModalidade;

    @Id
    @OneToOne
    @JoinColumn(name = "avaliacaoIdAluno", referencedColumnName = "alunoModalidadeIdAluno")
    private AlunoModalidade alunoModalidade2;

    @Id
    @OneToOne
    @JoinColumn(name = "avaliacaoIdModalidade", referencedColumnName = "alunoModalidadeIdModalidade")
    private AlunoModalidade alunoModalidade3;

}
