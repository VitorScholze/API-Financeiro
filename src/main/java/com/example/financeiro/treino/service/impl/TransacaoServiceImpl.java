package com.example.financeiro.treino.service.impl;

import org.springframework.stereotype.Service;

import com.example.financeiro.treino.dto.TransacaoDto;
import com.example.financeiro.treino.entity.Conta;
import com.example.financeiro.treino.entity.TipoTransacao;
import com.example.financeiro.treino.entity.Transacao;
import com.example.financeiro.treino.exception.ContaException;
import com.example.financeiro.treino.exception.TransacaoException;
import com.example.financeiro.treino.mapper.TransacaoMapper;
import com.example.financeiro.treino.repository.ContaRepository;
import com.example.financeiro.treino.repository.TransacaoRepository;
import com.example.financeiro.treino.service.TransacaoService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class TransacaoServiceImpl implements TransacaoService{

    private TransacaoRepository transacaoRepository;
    private ContaRepository contaRepository;

    public TransacaoDto criarTransacao(Long contaId, TransacaoDto transacaoDto){
            Conta conta = contaRepository.findById(contaId).orElseThrow(() -> new ContaException("Nenhuma conta encontrada!"));

            Transacao transacao  = TransacaoMapper.mapperToTransacao(transacaoDto);
            transacao.setConta(conta);

            if(transacao.getTipo() == TipoTransacao.SAIDA){
                if(transacao.getValor() > conta.getSaldo()){
                    throw new TransacaoException("Saldo insufisciente na conta");
                }else{
                    conta.setSaldo(conta.getSaldo() - transacao.getValor());
                }
            }

            if(transacao.getTipo() == TipoTransacao.ENTRADA){
                conta.setSaldo(conta.getSaldo() + transacao.getValor());
            }
            
            contaRepository.save(conta);
            Transacao transacaoSalva = transacaoRepository.save(transacao);


            return TransacaoMapper.mapperToDto(transacaoSalva);
            
        }
}
