package com.br.arthur.biblioteca.controller;

import com.br.arthur.biblioteca.entity.LivroEntity;
import com.br.arthur.biblioteca.entity.MembroEntity;
import com.br.arthur.biblioteca.service.MembroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membros")
public class MembroControler {

    private final MembroService membroService;

    public MembroControler(MembroService membroService) {
        this.membroService = membroService;
    }

    @PostMapping
    public MembroEntity criarMembro (@RequestBody MembroEntity membro) {
        return membroService.adicionarMembro(membro);
    }

    @GetMapping("buscarMembro/{id}")
    public MembroEntity buscarMembro(@PathVariable Long id) {
        return membroService.buscarId(id);
    }

    @GetMapping ("buscarTodosMembros")
    public List<MembroEntity> buscarTodosMembros() {
        return membroService.buscarTodos();
    }

    @DeleteMapping ("excluir/{id}")
    public void excluir(@PathVariable Long id) {
        membroService.excluir(id);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody MembroEntity membro) {
        membroService.atualizar(membro);
    }
}
