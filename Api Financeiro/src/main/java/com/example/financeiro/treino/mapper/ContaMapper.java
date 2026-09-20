package com.example.financeiro.treino.mapper;

import com.example.financeiro.treino.dto.ContaDto;
import com.example.financeiro.treino.entity.Conta;

public class ContaMapper {
    

    public static ContaDto mapperToDto(Conta conta){
        ContaDto contaDto = new ContaDto();

        contaDto.setId(conta.getId());
        contaDto.setTitular(conta.getTitular());
        contaDto.setSaldo(conta.getSaldo());
        contaDto.setTransacoes(conta.getTransacoes());


        return contaDto;
    }


    public static Conta mapperToConta(ContaDto contaDto){
        Conta conta = new Conta();

        conta.setId(contaDto.getId());
        conta.setTitular(contaDto.getTitular());
        conta.setSaldo(contaDto.getSaldo());
        conta.setTransacoes(contaDto.getTransacoes());

        return conta;
    }
}
