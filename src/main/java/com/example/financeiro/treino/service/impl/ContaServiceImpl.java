package com.example.financeiro.treino.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.financeiro.treino.dto.ContaDto;
import com.example.financeiro.treino.entity.Conta;
import com.example.financeiro.treino.exception.ContaException;
import com.example.financeiro.treino.mapper.ContaMapper;
import com.example.financeiro.treino.repository.ContaRepository;
import com.example.financeiro.treino.service.ContaService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class ContaServiceImpl implements ContaService {
    
    private ContaRepository contaRepository;
    

    public ContaDto criarConta(ContaDto dto){
        Conta conta = new Conta();
              conta.setId(dto.getId());
              conta.setTitular(dto.getTitular());
              conta.setTransacoes(dto.getTransacoes());
              conta.setSaldo(dto.getSaldo());

        Conta contaSalva = contaRepository.save(conta);

        return ContaMapper.mapperToDto(contaSalva);
    }


    public List<ContaDto> listarContas(){
        List<Conta> contas = contaRepository.findAll();

        return contas.stream().map(c -> ContaMapper.mapperToDto(c)).toList();
    }


    public ContaDto procurarConta( Long id){
        Conta conta = contaRepository.findById(id).orElseThrow(() -> new ContaException("Nenhuma conta com este id encontrada!"));

        return ContaMapper.mapperToDto(conta);
    }



    public String deletarConta(Long id){
        
        Conta conta = contaRepository.findById(id).orElseThrow(() -> new ContaException("Conta nao encontrada com este ID"));

        contaRepository.delete(conta);

        return "Conta deletada com sucesso!";
    }
    
}
