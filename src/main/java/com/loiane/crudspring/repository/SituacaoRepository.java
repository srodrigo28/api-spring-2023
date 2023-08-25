package com.loiane.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loiane.crudspring.models.Situacao;

public interface SituacaoRepository extends JpaRepository<Situacao, Long> {
    
}
