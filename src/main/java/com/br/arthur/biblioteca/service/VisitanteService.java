package com.br.arthur.biblioteca.service;

import com.br.arthur.biblioteca.entity.MembroEntity;
import com.br.arthur.biblioteca.entity.VisitanteEntity;
import com.br.arthur.biblioteca.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public VisitanteService(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }

    public VisitanteEntity adicionarVisitante(VisitanteEntity visitante) {
        return visitanteRepository.save(visitante);
    }

    public VisitanteEntity buscarId(long id) {
        return visitanteRepository.findById(id).orElseThrow();
    }

    public List<VisitanteEntity> buscarTodos() {
        return visitanteRepository.findAll();
    }

    public void excluir(Long id) {
        visitanteRepository.delete(buscarId(id));
    }

    public void atualizar(VisitanteEntity visitante) {
        visitanteRepository.atualizar(visitante.getId(), visitante.getNome(), visitante.getTelefone());
    }
}
