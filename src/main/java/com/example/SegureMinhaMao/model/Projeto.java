package com.example.SegureMinhaMao.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nomeProjeto;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private BigDecimal metaArrecadacao;
    @Column(nullable = false)
    private BigDecimal valorArrecadado;
    @Column(nullable = false)
    private LocalDateTime dataInicio;
    @Column(nullable = false)
    private LocalDateTime dataFim;
    @Column(nullable = false)
    private String categoria;

    @ManyToMany
    @JoinTable(
            name = "projeto_pessoaFisica",
            joinColumns = @JoinColumn(name = "projeto_id"),
            inverseJoinColumns = @JoinColumn(name = "pessoaFisica_id")
    )
    private Set<PessoaFisica> pessoaFisicas;

    @ManyToMany
    @JoinTable(
            name = "projeto_categoria",
            joinColumns = @JoinColumn(name = "projeto_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private Set<Categoria> categorias;

    public Projeto(){

    }

    public Projeto(Set<Categoria> categorias, Set<PessoaFisica> pessoaFisicas, String categoria, LocalDateTime dataFim, LocalDateTime dataInicio, BigDecimal valorArrecadado, BigDecimal metaArrecadacao, String descricao, String nomeProjeto, Long id) {
        this.categorias = categorias;
        this.pessoaFisicas = pessoaFisicas;
        this.categoria = categoria;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
        this.valorArrecadado = valorArrecadado;
        this.metaArrecadacao = metaArrecadacao;
        this.descricao = descricao;
        this.nomeProjeto = nomeProjeto;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getMetaArrecadacao() {
        return metaArrecadacao;
    }

    public void setMetaArrecadacao(BigDecimal metaArrecadacao) {
        this.metaArrecadacao = metaArrecadacao;
    }

    public BigDecimal getValorArrecadado() {
        return valorArrecadado;
    }

    public void setValorArrecadado(BigDecimal valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Set<PessoaFisica> getPessoaFisicas() {
        return pessoaFisicas;
    }

    public void setPessoaFisicas(Set<PessoaFisica> pessoaFisicas) {
        this.pessoaFisicas = pessoaFisicas;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }
}
