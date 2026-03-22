package com.example.exercicio7.services;

import java.util.List;
import java.util.Optional;

import com.example.exercicio7.models.FornecedoresModel;
import com.example.exercicio7.repositories.FornecedoresRepository;
import org.springframework.stereotype.Service;


@Service
public class FornecedoresService {

    private final FornecedoresRepository fornecedoresRepository;

    public FornecedoresService(FornecedoresRepository fornecedoresRepository) {
        this.fornecedoresRepository = fornecedoresRepository;
    }

    public FornecedoresModel criarFornecedor(FornecedoresModel fornecedor) {
        return fornecedoresRepository.save(fornecedor);
    }

    public List<FornecedoresModel> listarFornecedores() {
        return fornecedoresRepository.findAll();
    }

    public Optional<FornecedoresModel> buscarPorId(Long id) {
        return fornecedoresRepository.findById(id);
    }

    public void deletarFornecedor(Long id) {
        fornecedoresRepository.deleteById(id);
    }
}