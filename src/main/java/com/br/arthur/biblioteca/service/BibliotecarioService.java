package com.br.arthur.biblioteca.service;

import com.br.arthur.biblioteca.entity.BibliotecarioEntity;
import com.br.arthur.biblioteca.repository.BibliotecarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioService(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }

    public BibliotecarioEntity adicionarBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioRepository.save(bibliotecarioEntity);
    }

    public BibliotecarioEntity buscarId(long id) {
        return bibliotecarioRepository.findById(id).orElseThrow();
    }

    public List<BibliotecarioEntity> buscarTodos() {
        return bibliotecarioRepository.findAll();
    }

    public void excluir(Long id) {
        bibliotecarioRepository.delete(buscarId(id));
    }

    public void atualizar(BibliotecarioEntity bibliotecario) {
        bibliotecarioRepository.atualizar(bibliotecario.getNome(), bibliotecario.getEmail(), bibliotecario.getSenha(), bibliotecario.getId());
    }
}
