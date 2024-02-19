package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonal;

    @NotEmpty
    private String personalNome;

    @NotEmpty
    private String personalIdade;

    @NotEmpty
    private String personalTelefone;

    @NotEmpty
    private String personalSexo;
}
