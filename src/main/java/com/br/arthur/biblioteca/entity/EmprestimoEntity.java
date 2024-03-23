package com.br.arthur.biblioteca.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table (name = "Emprestimo", uniqueConstraints = @UniqueConstraint(columnNames = {"livro_id"}))
public class EmprestimoEntity {
     @Id
     @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "sequenceEmprestimo")
     @SequenceGenerator(name = "sequenceEmprestimo", allocationSize = 1)
     private Long id;
     private Date dataEmprestimo;
     private Date dataDevolucao;
     @OneToOne
     private LivroEntity livro;
     @ManyToOne
     private MembroEntity membro;
}
