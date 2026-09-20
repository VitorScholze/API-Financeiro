package com.example.financeiro.treino.mapper;

import com.example.financeiro.treino.dto.TransacaoDto;
import com.example.financeiro.treino.entity.Transacao;

public class TransacaoMapper {
    
    public static TransacaoDto mapperToDto(Transacao transacao){
        TransacaoDto dto = new TransacaoDto();

        dto.setId(transacao.getId());
        dto.setValor(transacao.getValor());
        dto.setDescricao(transacao.getDescricao());
        dto.setTipo(transacao.getTipo());
        dto.setDataTime(transacao.getDataTime());
        dto.setContaId(transacao.getConta().getId());

        return dto;
    }


    public static Transacao mapperToTransacao(TransacaoDto dto){
        Transacao tran = new Transacao();

        tran.setId(dto.getId());
        tran.setValor(dto.getValor());
        tran.setDescricao(dto.getDescricao());
        tran.setTipo(dto.getTipo());
        tran.setDataTime(dto.getDataTime());
        return tran;
    }
}
