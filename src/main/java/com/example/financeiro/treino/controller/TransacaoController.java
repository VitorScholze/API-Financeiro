package com.example.financeiro.treino.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.financeiro.treino.dto.TransacaoDto;
import com.example.financeiro.treino.service.TransacaoService;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping("/api/transacao")
@AllArgsConstructor 
public class TransacaoController {

    private TransacaoService transacaoService;

    @PostMapping("/{contaId}")
    public ResponseEntity <TransacaoDto> criarTransacao(@PathVariable Long contaId, @RequestBody TransacaoDto transacaoDto){

        TransacaoDto transacao = transacaoService.criarTransacao(contaId, transacaoDto);
        return new ResponseEntity<>(transacao, HttpStatus.CREATED);
    }

}
