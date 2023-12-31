package com.loiane.crudspring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Produto {
    
    @Id
    @JsonProperty("codigo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false)
    private String descricao;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private float valor;
}
