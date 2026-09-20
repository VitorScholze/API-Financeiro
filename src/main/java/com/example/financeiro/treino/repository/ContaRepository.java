package com.example.financeiro.treino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.financeiro.treino.entity.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{
    
}
