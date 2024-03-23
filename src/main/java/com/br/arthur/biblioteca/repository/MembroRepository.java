package com.br.arthur.biblioteca.repository;

import com.br.arthur.biblioteca.entity.BibliotecarioEntity;
import com.br.arthur.biblioteca.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    @Transactional
    @Modifying
    @Query ("update MembroEntity membro set" +
            " membro.nome = :nome," +
            " membro.endereco = :endereco," +
            " membro.telefone = :telefone" +
            " where membro.id = :id")
    void atualizar(Long id, String nome, String endereco, int telefone);
}
