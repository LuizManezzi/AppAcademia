package com.AppAcademia.AppAcademia.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAvaliacao;

    @NotEmpty
    private float avaliacaoPeso;

    @NotEmpty
    private float avaliacapValorMassaMuscular;

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
    private float avaliacaoAbdomen;

    @ManyToMany
    @JoinTable(name = "idAvaliacaoPersonalId", joinColumns = @JoinColumn(name = "idAvaliacaoPersonalId"),
            inverseJoinColumns = @JoinColumn(name = "idAlunoModalidadePersonal"))
    private List<alunoModalidade> alunoModalidade;

    @ManyToMany
    @JoinTable(name = "idAvaliacaoAlunoId", joinColumns =  @JoinColumn(name = "idAvaliacaoAlunoId"),
            inverseJoinColumns = @JoinColumn(name = "idAlunoModalidade"))
    private List<alunoModalidade> alunoModalidades;

    @ManyToMany
    @JoinTable(name = "idAvaliacaoModaliadeId", joinColumns = @JoinColumn(name = "idAvaliacaoModaliadeId"),
            inverseJoinColumns = @JoinColumn(name = "idAlunoModalidadeModalidade"))
    private List<alunoModalidade> alunoModalidadess;

    @ManyToMany(mappedBy = "avaliacao")
    private List<alunoModalidade> alunoModalidadesava;

//    @OneToMany
//    @JoinColumn(name = "idAvaliacaoModaliadeId", referencedColumnName = "idAlunoModalidadeModalidade")
//    private List<alunoModalidade> alunoModalidadess;

}
