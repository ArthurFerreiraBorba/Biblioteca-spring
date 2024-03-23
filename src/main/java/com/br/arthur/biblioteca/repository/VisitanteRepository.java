package com.br.arthur.biblioteca.repository;

import com.br.arthur.biblioteca.entity.BibliotecarioEntity;
import com.br.arthur.biblioteca.entity.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {
    @Transactional
    @Modifying
    @Query ("update VisitanteEntity visitante set" +
            " visitante.nome = :nome," +
            " visitante.telefone = :telefone" +
            " where visitante.id = :id")
    void atualizar(@Param("id") Long id, @Param("nome") String nome, @Param("telefone") int telefone);
}
