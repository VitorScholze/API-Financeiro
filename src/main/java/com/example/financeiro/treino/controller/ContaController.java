package com.example.financeiro.treino.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.financeiro.treino.dto.ContaDto;
import com.example.financeiro.treino.service.ContaService;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping("/api/conta")
@AllArgsConstructor 
public class ContaController {
    
    private ContaService contaService;

    @PostMapping
    public ResponseEntity<ContaDto> criarConta(@RequestBody ContaDto contaDto){
        ContaDto conta = contaService.criarConta(contaDto);
        return new ResponseEntity<>(conta, HttpStatus.CREATED);
    }



    @GetMapping 
    public ResponseEntity<List<ContaDto>> listarContas(){
        List<ContaDto> contas = contaService.listarContas();
        return ResponseEntity.ok(contas);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ContaDto> procurarConta(@PathVariable Long id){
        ContaDto conta = contaService.procurarConta(id);
        return ResponseEntity.ok(conta);
    }
}
