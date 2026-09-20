package com.example.financeiro.treino.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor 
@NoArgsConstructor 
@Setter 
@Getter
@Entity 
public class Conta {

    private Long id;

    private String titular;

    private Double saldo;

    @OneToMany(mappedBy = "conta")
    private List<Transacao> transacoes;


}
