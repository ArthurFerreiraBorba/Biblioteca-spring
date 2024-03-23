package com.br.arthur.biblioteca.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "Bibliotecario")
public class BibliotecarioEntity {
     @Id
     @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "sequenceBibliotecario")
     @SequenceGenerator(name = "sequenceBibliotecario", allocationSize = 1)
     private Long id;
     private String nome;
     private String email;
     private int senha;
}
