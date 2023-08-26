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

import com.loiane.crudspring.models.Membro;
import com.loiane.crudspring.repository.MembroRepository;

import lombok.AllArgsConstructor;

@Component
@RestController
@AllArgsConstructor
@RequestMapping("/api/membro")
public class MembroController {

    private final MembroRepository membroRepository;

    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Membro> list() {
        return membroRepository.findAll();
    }
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Membro create(@RequestBody Membro m) {
        return membroRepository.save(m);
    }
}
