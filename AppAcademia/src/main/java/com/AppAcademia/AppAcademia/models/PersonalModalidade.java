package com.AppAcademia.AppAcademia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PersonalModalidade {

    @Id
    @OneToOne
    @JoinColumn(name = "personalIdPersonal", referencedColumnName = "idPersonal")
    private Personal personalIdPersonal;

    @Id
    @OneToOne
    @JoinColumn(name = "PersonalIdModalidade", referencedColumnName = "idModalidade")
    private Modalidade PersonalIdModalidade;

}
