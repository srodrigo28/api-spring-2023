package com.loiane.crudspring.controllers;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public List<Condominio> list() {
        return condominioRepository.findAll();
    }

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public void create(@RequestBody Condominio c) {
        condominioRepository.save(c);
        System.out.println(c.getNome());
        System.out.println(c.getCnpj());
        System.out.println(c.getCidade());
        System.out.println(c.getBairro());
        System.out.println(c.getEndereco());
        System.out.println(c.getData_inicio());
        System.out.println(c.getValor_contrato());

    }
}
