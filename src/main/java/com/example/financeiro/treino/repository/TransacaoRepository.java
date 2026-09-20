package com.example.financeiro.treino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.financeiro.treino.entity.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    
}
