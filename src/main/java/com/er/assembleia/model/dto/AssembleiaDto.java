package com.er.assembleia.model.dto;

import com.er.assembleia.model.Assembleia;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


public class AssembleiaDto {

    private Long id;
    private String titulo;
    private String descricao;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime inicioAssembleia;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime fimAssembleia;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime dataCriacao;

    public AssembleiaDto() {
    }

    public AssembleiaDto(Assembleia assembleia) {
        this.id = assembleia.getId();
        this.titulo = assembleia.getTitulo();
        this.descricao = assembleia.getDescricao();
        this.inicioAssembleia = assembleia.getInicioAssembleia();
        this.fimAssembleia = assembleia.getFimAssembleia();
        this.dataCriacao = assembleia.getDataCriacao();
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

    public LocalDateTime getInicioAssembleia() {
        return inicioAssembleia;
    }

    public void setInicioAssembleia(LocalDateTime inicioAssembleia) {
        this.inicioAssembleia = inicioAssembleia;
    }

    public LocalDateTime getFimAssembleia() {
        return fimAssembleia;
    }

    public void setFimAssembleia(LocalDateTime fimAssembleia) {
        this.fimAssembleia = fimAssembleia;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
