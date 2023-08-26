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

import com.loiane.crudspring.models.Condominio;
import com.loiane.crudspring.repository.CondominioRepository;

import lombok.AllArgsConstructor;

@Component
@RestController
@AllArgsConstructor
@RequestMapping("/api/condominio")
public class CondominioController {

    private final CondominioRepository condominioRepository;

    /** Methodo Get
     * Listando Todos os Condominios
     */
    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Condominio> list() {
        return condominioRepository.findAll();
    }

    /** Methodo Post
     * Adicionando Condominio Via Post
     **/
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Condominio create(@RequestBody Condominio c){
        return condominioRepository.save(c);

    }
}
