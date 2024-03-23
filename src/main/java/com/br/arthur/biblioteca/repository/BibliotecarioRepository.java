package com.br.arthur.biblioteca.repository;

import com.br.arthur.biblioteca.entity.BibliotecarioEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    @Transactional
    @Modifying
    @Query ("update BibliotecarioEntity bibliotecario set" +
            " bibliotecario.nome = :nome," +
            " bibliotecario.email = :email," +
            " bibliotecario.senha = :senha" +
            " where bibliotecario.id = :id")
    void atualizar(@Param("nome") String nome, @Param("email") String email, @Param("senha") int senha, @Param("id") Long id);
}
