package com.loiane.crudspring.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.loiane.crudspring.models.Situacao;
import com.loiane.crudspring.repository.SituacaoRepository;

import lombok.AllArgsConstructor;

@Component
@RestController
@AllArgsConstructor
@RequestMapping("/api/situacao")
public class SituacaoController {

    private final SituacaoRepository situacaoRepository;

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Situacao> list() {
        return situacaoRepository.findAll();
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    Situacao create(@RequestBody Situacao s) {
        return situacaoRepository.save(s);
    }
}
