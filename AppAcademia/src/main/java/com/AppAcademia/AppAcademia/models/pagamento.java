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
public class pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPagamento;

    @OneToOne
    @JoinColumn(name = "idPlanoAluno", referencedColumnName = "idPlano")
    private plano planos;

    @NotEmpty
    private float pagamentoValor;

    @NotEmpty
    private float pagamentoValorDesconto;

    @OneToOne
    @JoinColumn(name = "idAlunoPagamento", referencedColumnName = "idAluno")
    private aluno aluno;
    
}
