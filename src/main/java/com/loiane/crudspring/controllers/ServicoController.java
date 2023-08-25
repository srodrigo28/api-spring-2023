package com.loiane.crudspring.controllers;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loiane.crudspring.models.Servico;
import com.loiane.crudspring.repository.ServicoRepository;

import lombok.AllArgsConstructor;

@Component
@RestController
@AllArgsConstructor
@RequestMapping("/api/servico")
public class ServicoController {

    private final ServicoRepository servicoRepository;

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Servico> list(){
        return servicoRepository.findAll();
    }
}
