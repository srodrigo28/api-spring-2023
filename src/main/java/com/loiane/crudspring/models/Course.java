package com.loiane.crudspring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

// @Getter
// @Setter
@Data
@Entity
// @Table( name = "cursos")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String category;

}
