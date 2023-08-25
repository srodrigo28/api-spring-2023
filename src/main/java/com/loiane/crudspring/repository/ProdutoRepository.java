package com.loiane.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loiane.crudspring.models.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
