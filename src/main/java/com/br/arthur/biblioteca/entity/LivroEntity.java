package com.br.arthur.biblioteca.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table (name = "Livro")
public class LivroEntity {
     @Id
     @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "sequenceLivro")
     @SequenceGenerator(name = "sequenceLivro", allocationSize = 1)
     private Long id;
     private String titulo;
     private String autor;
     private int anoPublicacao;
}
