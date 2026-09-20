package com.example.financeiro.treino.dto;

import java.util.List;

import com.example.financeiro.treino.entity.Transacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor 
@Setter 
@Getter 
@NoArgsConstructor 
public class ContaDto {
    

    Long id;

    String titular;

    Double saldo;

    List<Transacao> transacoes;
}  

