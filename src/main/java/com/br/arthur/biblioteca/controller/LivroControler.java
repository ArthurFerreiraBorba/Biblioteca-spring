package com.br.arthur.biblioteca.controller;

import com.br.arthur.biblioteca.entity.LivroEntity;
import com.br.arthur.biblioteca.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroControler {

    private final LivroService livroService;

    public LivroControler(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public LivroEntity criarMembro (@RequestBody LivroEntity livro) {
        return livroService.adicionarLivro(livro);
    }

    @GetMapping("buscarLivro/{id}")
    public LivroEntity buscarLivro(@PathVariable Long id) {
        return livroService.buscarId(id);
    }

    @GetMapping ("buscarTodosLivros")
    public List<LivroEntity> buscarTodosLivros() {
        return livroService.buscarTodos();
    }

    @DeleteMapping ("excluir/{id}")
    public void excluir(@PathVariable Long id) {
        livroService.excluir(id);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody LivroEntity livro) {
        livroService.atualizar(livro);
    }
}
