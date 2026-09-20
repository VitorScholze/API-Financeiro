package com.example.financeiro.treino.service;

import com.example.financeiro.treino.dto.TransacaoDto;

public interface TransacaoService {
    
    public TransacaoDto criarTransacao(Long id, TransacaoDto transacaoDto);
}
