package com.br.arthur.biblioteca.controller;

import com.br.arthur.biblioteca.entity.EmprestimoEntity;
import com.br.arthur.biblioteca.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emprestimos")
public class EmprestimoControler {

    private final EmprestimoService emprestimoService;

    public EmprestimoControler(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping ("/{idLivro}/livro/{idMembro}/membro")
    public EmprestimoEntity criarMembro (@RequestBody EmprestimoEntity emprestimo, @PathVariable Long idLivro, @PathVariable Long idMembro) {
        return emprestimoService.adicionarEmprestimo(emprestimo, idLivro, idMembro);
    }

    @GetMapping ("buscarEmprestimo/{id}")
    public EmprestimoEntity buscarEmprestimo(@PathVariable Long id) {
        return emprestimoService.buscarId(id);
    }

    @GetMapping ("buscarTodosEmprestimos")
    public List<EmprestimoEntity> buscarTodosEmprestimos() {
        return emprestimoService.buscarTodos();
    }

    @DeleteMapping ("excluir/{id}")
    public void excluir(@PathVariable Long id) {
        emprestimoService.excluir(id);
    }

    @PutMapping ("atualizar/{idLivro}/livro/{idMembro}/membro")
    public void atualizar (@RequestBody EmprestimoEntity emprestimo, @PathVariable Long idLivro, @PathVariable Long idMembro) {
        emprestimoService.atualizar(emprestimo, idLivro, idMembro);
    }
}
