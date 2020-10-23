package com.er.assembleia.model.dto;

import com.er.assembleia.model.Assembleia;

import java.time.LocalDateTime;


public class AssembleiaDto {

    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataAssembleia;
    private LocalDateTime dataCriação;

    public AssembleiaDto() {
    }

    public AssembleiaDto(Assembleia assembleia) {
        this.id = assembleia.getId();
        this.titulo = assembleia.getTitulo();
        this.descricao = assembleia.getDescricao();
        this.dataAssembleia = assembleia.getDataAssembleia();
        this.dataCriação = assembleia.getDataCriacao();
    }

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

    public LocalDateTime getDataCriação() {
        return dataCriação;
    }

    public void setDataCriação(LocalDateTime dataCriação) {
        this.dataCriação = dataCriação;
    }

}
