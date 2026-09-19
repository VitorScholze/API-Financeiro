package com.example.financeiro.treino.service.impl;

import org.springframework.stereotype.Service;

import com.example.financeiro.treino.dto.TransacaoDto;
import com.example.financeiro.treino.entity.Conta;
import com.example.financeiro.treino.exception.ContaException;
import com.example.financeiro.treino.repository.ContaRepository;
import com.example.financeiro.treino.repository.TransacaoRepository;
import com.example.financeiro.treino.service.TransacaoService;

@Service 
public class TransacaoServiceImpl implements TransacaoService{

    private TransacaoRepository transacaoRepository;
    private ContaRepository contaRepository;

    public TransacaoDto criarTransacao(Long contaId, TransacaoDto transacaoDto){
            Conta conta = contaRepository.findById(contaId).orElseThrow(() -> new ContaException("Nenhuma conta encontrada!"));

        

        }
}
