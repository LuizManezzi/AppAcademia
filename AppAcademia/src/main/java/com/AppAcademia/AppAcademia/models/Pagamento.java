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
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPagamento;

    @OneToOne
    private Plano plano;

    @NotEmpty
    private float pagamentoValor;

    @NotEmpty
    private float pagamentoValorDesconto;

    @ManyToOne
    private Aluno aluno;

}
