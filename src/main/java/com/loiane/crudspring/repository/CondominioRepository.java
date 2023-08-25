package com.loiane.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loiane.crudspring.models.Condominio;

public interface CondominioRepository extends JpaRepository<Condominio, Long> {
    
}
