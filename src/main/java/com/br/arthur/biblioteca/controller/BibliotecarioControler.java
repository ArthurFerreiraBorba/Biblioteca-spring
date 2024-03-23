package com.br.arthur.biblioteca.controller;

import com.br.arthur.biblioteca.entity.BibliotecarioEntity;
import com.br.arthur.biblioteca.service.BibliotecarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecarios")
public class BibliotecarioControler {

    private final BibliotecarioService bibliotecarioService;

    public BibliotecarioControler(BibliotecarioService bibliotecarioService) {
        this.bibliotecarioService = bibliotecarioService;
    }

    @PostMapping
    public BibliotecarioEntity criarMembro(@RequestBody BibliotecarioEntity bibliotecario) {
        return bibliotecarioService.adicionarBibliotecario(bibliotecario);
    }

    @GetMapping ("buscarBibliotecario/{id}")
    public BibliotecarioEntity buscarBibliotecario(@PathVariable Long id) {
        return bibliotecarioService.buscarId(id);
    }

    @GetMapping ("buscarTodosBibliotecarios")
    public List<BibliotecarioEntity> buscarTodosBibliotecarios() {
        return bibliotecarioService.buscarTodos();
    }

    @DeleteMapping ("excluir/{id}")
    public void excluir(@PathVariable Long id) {
        bibliotecarioService.excluir(id);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody BibliotecarioEntity bibliotecario) {
        bibliotecarioService.atualizar(bibliotecario);
    }
}
