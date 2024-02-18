package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHorario;

    @NotEmpty
    private Time horarioInicio;

    @NotEmpty
    private Time horarioFim;

    @NotEmpty
    @OneToOne
    @JoinColumn(name = "idModalidadeHorario", referencedColumnName = "idModalidade")
    private modalidade modalidade;

    @ManyToMany(mappedBy = "horario")
    private List<alunoModalidade> alunoModalidades;
}
