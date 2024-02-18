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
@NoArgsConstructor
@AllArgsConstructor
public class plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPlano;

    @NotEmpty
    private float planoDesconto;

    @NotEmpty
    private String planoDescricao;

    @NotEmpty
    private int quantidadeMeses;

    @NotEmpty
    @OneToMany(mappedBy = "plano", cascade = CascadeType.REMOVE)
    private List<aluno> alunos;

    @NotEmpty
    @OneToMany(mappedBy = "plano", cascade = CascadeType.REMOVE)
    private List<pagamento> pagamentos;

}
