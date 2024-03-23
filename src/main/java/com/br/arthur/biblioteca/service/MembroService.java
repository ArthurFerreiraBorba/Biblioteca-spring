package com.br.arthur.biblioteca.service;

import com.br.arthur.biblioteca.entity.LivroEntity;
import com.br.arthur.biblioteca.entity.MembroEntity;
import com.br.arthur.biblioteca.repository.MembroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {
    private final MembroRepository membroRepository;

    public MembroService(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    public MembroEntity adicionarMembro(MembroEntity membro) {
        return membroRepository.save(membro);
    }

    public MembroEntity buscarId(long id) {
        return membroRepository.findById(id).orElseThrow();
    }

    public List<MembroEntity> buscarTodos() {
        return membroRepository.findAll();
    }

    public void excluir(Long id) {
        membroRepository.delete(buscarId(id));
    }

    public void atualizar(MembroEntity membro) {
        membroRepository.atualizar(membro.getId(), membro.getNome(), membro.getEndereco(), membro.getTelefone());
    }
}
