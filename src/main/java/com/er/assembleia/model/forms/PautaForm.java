package com.er.assembleia.model.forms;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class PautaForm {

    private String titulo;
    private String descricao;
    private Long assembleiaId;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime inicioSessao;
    private Long duracao;

    public PautaForm() {
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

    public Long getAssembleiaId() {
        return assembleiaId;
    }

    public void setAssembleiaId(Long assembleiaId) {
        this.assembleiaId = assembleiaId;
    }

    public LocalDateTime getInicioSessao() {
        return inicioSessao;
    }

    public void setInicioSessao(LocalDateTime inicioSessao) {
        this.inicioSessao = inicioSessao;
    }

    public Long getDuracao() {
        return duracao;
    }

    public void setDuracao(Long duracao) {
        this.duracao = duracao;
    }
}
