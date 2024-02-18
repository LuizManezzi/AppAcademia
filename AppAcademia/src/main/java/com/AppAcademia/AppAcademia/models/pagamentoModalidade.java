package com.AppAcademia.AppAcademia.models;

//import jakarta.persistence.Column;

import jakarta.persistence.*;
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
public class pagamentoModalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPagamentoModalidade;

    @ManyToMany
    @JoinTable(name = "idModalidadeModalidade", joinColumns = @JoinColumn(name = "idModalidadeModalidade"),
            inverseJoinColumns = @JoinColumn(name = "idModalidade"))
    private List<modalidade> modalidade;

    @OneToOne
    @JoinColumn(name = "idPagamentoPagamento", referencedColumnName = "idPagamento")
    private pagamento pagamento;


}
