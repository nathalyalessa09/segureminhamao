package com.example.SegureMinhaMao.model;
import com.example.SegureMinhaMao.model.PessoaFisica;


import jakarta.persistence.*;

@Entity
public class PessoaJuridica extends PessoaFisica {

    @Column(nullable = false)
    private String nomeFantasia;
    @Column(nullable = false)
    private String razaoSocial;
    @Column(nullable = false, unique = true)
    private String cnpj;


    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
