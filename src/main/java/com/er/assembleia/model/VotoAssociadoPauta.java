package com.er.assembleia.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VotoAssociadoPauta {

    @Column(name = "cod_associado")
    private Long associadoId;
    @Column(name = "cod_pauta")
    private Long pautaId;

    public VotoAssociadoPauta() {
    }

    public VotoAssociadoPauta(Long associadoId, Long pautaId) {
        this.associadoId = associadoId;
        this.pautaId = pautaId;
    }

    public Long getAssociadoId() {
        return associadoId;
    }

    public Long getPautaId() {
        return pautaId;
    }

}
