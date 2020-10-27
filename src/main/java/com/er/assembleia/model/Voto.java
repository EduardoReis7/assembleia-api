package com.er.assembleia.model;

import javax.persistence.*;

@Entity
public class Voto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_voto")
    private Long id;
    @Column(name = "voto")
    private Boolean voto;
    @Column(name = "cod_sessao")
    private Long pautaId;

    public Boolean getVoto() {
        return voto;
    }

    public void setVoto(Boolean voto) {
        this.voto = voto;
    }

    public Long getPautaId() {
        return pautaId;
    }

    public void setPautaId(Long pautaId) {
        this.pautaId = pautaId;
    }
}
