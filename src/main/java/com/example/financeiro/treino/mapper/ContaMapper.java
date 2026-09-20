package com.example.financeiro.treino.mapper;

import java.util.List;

import com.example.financeiro.treino.dto.ContaDto;
import com.example.financeiro.treino.dto.TransacaoDto;
import com.example.financeiro.treino.entity.Conta;
import com.example.financeiro.treino.entity.Transacao;

public class ContaMapper {
    
    public static ContaDto mapperToDto(Conta conta){
        ContaDto contaDto = new ContaDto();

        contaDto.setId(conta.getId());
        contaDto.setTitular(conta.getTitular());
        contaDto.setSaldo(conta.getSaldo());
        List<TransacaoDto> transacoesDto = conta.getTransacoes().stream()
            .map(TransacaoMapper::mapperToDto)
            .toList();
        contaDto.setTransacoes(transacoesDto);


        return contaDto;
    }


    public static Conta mapperToConta(ContaDto contaDto){
        Conta conta = new Conta();

        conta.setId(contaDto.getId());
        conta.setTitular(contaDto.getTitular());
        conta.setSaldo(contaDto.getSaldo());
        return conta;
    }
}
