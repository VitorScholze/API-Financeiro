package com.example.financeiro.treino.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor 
@NoArgsConstructor 
@Setter 
@Getter 
@Entity 
public class Transacao {

    private Long id;

    private String descricao;

    private Double valor;

    private TipoTransacao tipo;

    private LocalDateTime dataTime;

}
