package com.br.arthur.biblioteca.repository;

import com.br.arthur.biblioteca.entity.EmprestimoEntity;
import com.br.arthur.biblioteca.entity.LivroEntity;
import com.br.arthur.biblioteca.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

    @Transactional
    @Modifying
    @Query("update EmprestimoEntity emprestimo set" +
            " emprestimo.dataEmprestimo = :dataEmprestimo," +
            " emprestimo.dataDevolucao = :dataDevolucao," +
            " emprestimo.membro = :membro," +
            " emprestimo.livro = :livro" +
            " where emprestimo.id = :id")
    void atualizar(@Param("id") Long id, @Param("dataEmprestimo") Date dataEmprestimo, @Param("dataDevolucao") Date dataDevolucao, @Param("membro") MembroEntity membro, @Param("livro") LivroEntity livro);
}
