package com.er.assembleia.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "assembleia")
public class Assembleia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_assembleia")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_assembleia")
    private LocalDateTime dataAssembleia;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "assembleia", cascade = CascadeType.REMOVE)
    private List<Pauta> listaPautas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataAssembleia() {
        return dataAssembleia;
    }

    public void setDataAssembleia(LocalDateTime dataAssembleia) {
        this.dataAssembleia = dataAssembleia;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<Pauta> getListaPautas() {
        return listaPautas;
    }

    public void setListaPautas(List<Pauta> listaPautas) {
        this.listaPautas = listaPautas;
    }
}
