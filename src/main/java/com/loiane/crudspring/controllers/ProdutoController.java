package com.loiane.crudspring.controllers;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loiane.crudspring.models.Produto;
import com.loiane.crudspring.repository.ProdutoRepository;

import lombok.AllArgsConstructor;

@Component
@RestController
@AllArgsConstructor
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    private final ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> list(){
        return produtoRepository.findAll();
    }
}
