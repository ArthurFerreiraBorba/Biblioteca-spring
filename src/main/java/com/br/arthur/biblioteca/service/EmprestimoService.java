package com.br.arthur.biblioteca.service;

import com.br.arthur.biblioteca.entity.EmprestimoEntity;
import com.br.arthur.biblioteca.repository.EmprestimoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {
    private final EmprestimoRepository emprestimoRepository;
    private final LivroService livroService;
    private final MembroService membroService;

    public EmprestimoService(EmprestimoRepository emprestimoRepository, LivroService livroService, MembroService membroService) {
        this.emprestimoRepository = emprestimoRepository;
        this.livroService = livroService;
        this.membroService = membroService;
    }

    public EmprestimoEntity adicionarEmprestimo(EmprestimoEntity emprestimo, long idLivro, long idMembro) {
        emprestimo.setLivro(livroService.buscarId(idLivro));
        emprestimo.setMembro(membroService.buscarId(idMembro));
        return emprestimoRepository.save(emprestimo);
    }

    public EmprestimoEntity buscarId(long id) {
        return emprestimoRepository.findById(id).orElseThrow();
    }

    public List<EmprestimoEntity> buscarTodos() {
        return emprestimoRepository.findAll();
    }

    public void excluir(Long id) {
        emprestimoRepository.delete(buscarId(id));
    }

    public void atualizar(EmprestimoEntity emprestimo, Long idLivro, Long idMembro) {
        emprestimo.setLivro(livroService.buscarId(idLivro));
        emprestimo.setMembro(membroService.buscarId(idMembro));
        emprestimoRepository.atualizar(emprestimo.getId(), emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao(), emprestimo.getMembro(), emprestimo.getLivro());
    }
}
