package com.example.SegureMinhaMao.repository;

import com.example.SegureMinhaMao.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
        // Aqui você pode adicionar métodos personalizados, como:
        // List<Projeto> findByCategoria(String categoria);
    }
