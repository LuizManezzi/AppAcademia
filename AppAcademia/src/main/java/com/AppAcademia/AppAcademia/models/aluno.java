package com.AppAcademia.AppAcademia.models;

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
@NotEmpty
public class aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAluno;

    private String nomeAluno;

    private int alunoIdade;

    private String alunoSexo;

    private String alunoEndereco;

    @Column(unique = true)
    private String alunoCpf;

    private String alunoDataNascimento;

    private String alunoTelefone;

    private String alunoEmail;

    private Float alunoPeso;

    private Float alunoAltura;

    @ManyToOne
    private modalidade alunoModalidade;

    @ManyToOne
    @JoinColumn(name = "idAlunoPlano", referencedColumnName = "idPlano")
    private plano alunoPlano;

    @ManyToOne
    @JoinColumn(name = "idStatusAluno", referencedColumnName = "idStatus")
    private status statusAluno;



}