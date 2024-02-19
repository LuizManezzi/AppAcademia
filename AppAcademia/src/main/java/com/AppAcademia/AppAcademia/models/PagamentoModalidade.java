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
public class PagamentoModalidade {

    @Id
    @OneToOne
    @JoinColumn(name = "pagamentoIdModalidade", referencedColumnName = "idModalidade")
    private Modalidade pagamentoIdModalidade;

    @Id
    @OneToOne
    @JoinColumn(name = "pagamentoIdPagamento", referencedColumnName = "idPagamento")
    private Pagamento pagamentoIdPagamento;

}
