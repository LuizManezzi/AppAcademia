package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHorario;

    @NotEmpty
    private String horarioInicio;

    @NotEmpty
    private String horarioFim;

    @OneToOne
    private Modalidade modalidade;

}
