package com.example.exercicio7.repositories;

import com.example.exercicio7.models.FornecedoresModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedoresRepository extends JpaRepository<FornecedoresModel, Long> {

}