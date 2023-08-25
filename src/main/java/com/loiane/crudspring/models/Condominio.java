package com.loiane.crudspring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Condominio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(length = 20, nullable = false)
    private String cnpj;

    @Column(length = 30, nullable = false)
    private String cidade;

    @Column(length = 30, nullable = false)
    private String bairro;

    @Column(length = 30, nullable = false)
    private String endereco;

    @Column(length = 20, nullable = false)
    private String data_inicio;
    
    @Column(nullable = false)
    private Float valor_contrato;
}
