package com.example.financeiro.treino.service;

import java.util.List;

import com.example.financeiro.treino.dto.ContaDto;

public interface ContaService {
    
public ContaDto criarConta(ContaDto contaDto);

public List<ContaDto> listarContas();

public ContaDto procurarConta(Long id);

public String deletarConta(Long id);
}
