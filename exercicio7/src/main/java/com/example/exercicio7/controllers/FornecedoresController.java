package com.example.exercicio7.controllers;

import java.util.List;
import java.util.Optional;

import com.example.exercicio7.models.FornecedoresModel;
import com.example.exercicio7.services.FornecedoresService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/fornecedores")
public class FornecedoresController {

    private final FornecedoresService fornecedoresService;

    public FornecedoresController(FornecedoresService fornecedoresService) {
        this.fornecedoresService = fornecedoresService;
    }

    @PostMapping
    public FornecedoresModel criarFornecedor(@RequestBody FornecedoresModel fornecedor) {
        return fornecedoresService.criarFornecedor(fornecedor);
    }

    @GetMapping
    public List<FornecedoresModel> listarFornecedores() {
        return fornecedoresService.listarFornecedores();
    }

    @GetMapping("/{id}")
    public Optional<FornecedoresModel> buscarPorId(@PathVariable Long id) {
        return fornecedoresService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarFornecedor(@PathVariable Long id) {
        fornecedoresService.deletarFornecedor(id);
    }
}