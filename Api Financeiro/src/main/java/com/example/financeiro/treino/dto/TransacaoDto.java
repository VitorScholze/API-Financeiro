package com.example.financeiro.treino.dto;

import java.time.LocalDateTime;

import com.example.financeiro.treino.entity.TipoTransacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
@AllArgsConstructor 
@Setter 
@Getter 
public class TransacaoDto {
    
     private Long id;

    private String descricao;

    private Double valor;

    private TipoTransacao tipo;

    private LocalDateTime dataTime;
}
