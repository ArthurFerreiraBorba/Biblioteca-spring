package com.br.arthur.biblioteca.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "Visitante")
public class VisitanteEntity {
     @Id
     @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "sequenceVisitante")
     @SequenceGenerator(name = "sequenceVisitante", allocationSize = 1)
     private Long id;
     private String nome;
     private int telefone;
}
