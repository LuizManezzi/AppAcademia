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
public class personalModalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @ManyToMany
    @JoinTable(name = "idPersonalModalidade", joinColumns = @JoinColumn(name = "idPersonalModalidade"),
            inverseJoinColumns = @JoinColumn(name = "idPersonal"))
    private List<personal> personal;

    @NotEmpty
    @ManyToMany
    @JoinTable(name = "idModalidadePersonal", joinColumns = @JoinColumn(name = "idModalidadePersonal"),
            inverseJoinColumns = @JoinColumn(name = "idModalidade"))
    private List<modalidade> modalidades;


//    @OneToMany
//    @JoinColumn(name = "idModalidadePersonal", referencedColumnName = "idModalidade")
//    private List<modalidade> modalidade;

}
