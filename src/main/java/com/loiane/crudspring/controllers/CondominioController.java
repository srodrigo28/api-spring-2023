package com.loiane.crudspring.controllers;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loiane.crudspring.models.Condominio;
import com.loiane.crudspring.repository.CondominioRepository;

import lombok.AllArgsConstructor;

@Component
@RestController
@AllArgsConstructor
@RequestMapping("/api/condominio")
public class CondominioController {

    private final CondominioRepository condominioRepository;

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Condominio> list(){
        return condominioRepository.findAll();
    }
}
