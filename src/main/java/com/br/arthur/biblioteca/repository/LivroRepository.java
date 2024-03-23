package com.br.arthur.biblioteca.repository;

import com.br.arthur.biblioteca.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    @Transactional
    @Modifying
    @Query("update LivroEntity livro set" +
            " livro.autor = :autor," +
            " livro.titulo = :titulo," +
            " livro.anoPublicacao = :anoPublicacao" +
            " where livro.id = :id")
    void atualizar(@Param("id") Long id, @Param("anoPublicacao") int anoPublicacao, @Param("autor")String autor, @Param("titulo") String titulo);
}
