package com.br.arthur.biblioteca.service;

import com.br.arthur.biblioteca.entity.LivroEntity;
import com.br.arthur.biblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public LivroEntity adicionarLivro(LivroEntity livro) {
        return livroRepository.save(livro);
    }

    public LivroEntity buscarId(long id) {
        return livroRepository.findById(id).orElseThrow();
    }

    public List<LivroEntity> buscarTodos() {
        return livroRepository.findAll();
    }

    public void excluir(Long id) {
       livroRepository.delete(buscarId(id));
    }

    public void atualizar(LivroEntity livro) {
        livroRepository.atualizar(livro.getId(), livro.getAnoPublicacao(), livro.getAutor(), livro.getTitulo());
    }
}
