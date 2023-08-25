package com.loiane.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loiane.crudspring.models.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    
}
