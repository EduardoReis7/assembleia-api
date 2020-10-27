package com.er.assembleia.model.forms;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class AtualizarAssembleiaForm {

    @Size(max = 50)
    private String titulo;
    @Size(max = 150)
    private String descricao;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime inicioAssembleia;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime fimAssembleia;

    public AtualizarAssembleiaForm() {
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
}
