package com.br.arthur.biblioteca.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "Membro")
public class MembroEntity {
     @Id
     @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "sequenceMembro")
     @SequenceGenerator(name = "sequenceMembro", allocationSize = 1)
     private Long id;
     private String nome;
     private String endereco;
     private int telefone;
}
