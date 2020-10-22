package com.er.model;

import java.time.LocalDateTime;


public class Sessao {

    private LocalDateTime inicioSessao;
    private Long duracaoSessao;

    public LocalDateTime getInicioSessao() {
        return inicioSessao;
    }

    public void setInicioSessao(LocalDateTime inicioSessao) {
        this.inicioSessao = inicioSessao;
    }

    public Long getDuracaoSessao() {
        return duracaoSessao;
    }

    public void setDuracaoSessao(Long duracaoSessao) {
        this.duracaoSessao = duracaoSessao;
    }
}
