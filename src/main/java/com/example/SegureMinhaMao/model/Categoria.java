package com.example.SegureMinhaMao.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "categorias")
    private Set<Projeto> projetos;

    public Categoria() {
    }

    public Categoria(Long id, String nome, Set<Projeto> projetos) {
        this.id = id;
        this.nome = nome;
        this.projetos = projetos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(Set<Projeto> projetos) {
        this.projetos = projetos;
    }
}
