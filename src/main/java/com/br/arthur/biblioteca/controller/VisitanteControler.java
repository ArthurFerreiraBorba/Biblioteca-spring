package com.br.arthur.biblioteca.controller;

import com.br.arthur.biblioteca.entity.MembroEntity;
import com.br.arthur.biblioteca.entity.VisitanteEntity;
import com.br.arthur.biblioteca.service.VisitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
public class VisitanteControler {

    private final VisitanteService visitanteService;

    public VisitanteControler(VisitanteService vistanteService) {
        this.visitanteService = vistanteService;
    }

    @PostMapping
    public VisitanteEntity criarMembro (@RequestBody VisitanteEntity visitante) {
        return visitanteService.adicionarVisitante(visitante);
    }
    @GetMapping("buscarVisitante/{id}")
    public VisitanteEntity buscarVisitante(@PathVariable Long id) {
        return visitanteService.buscarId(id);
    }

    @GetMapping ("buscarTodosVisitantes")
    public List<VisitanteEntity> buscarTodosVisitantes() {
        return visitanteService.buscarTodos();
    }

    @DeleteMapping ("excluir/{id}")
    public void excluir(@PathVariable Long id) {
        visitanteService.excluir(id);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody VisitanteEntity visitante) {
        visitanteService.atualizar(visitante);
    }
}
