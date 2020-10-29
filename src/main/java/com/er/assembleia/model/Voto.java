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

    @Embedded
    private VotoAssociadoPauta votoAssociadoPauta;

    public Voto() {}

    public Voto(Pauta pauta, Boolean voto, Associado associado) {
        this.votoAssociadoPauta = new VotoAssociadoPauta(
                pauta.getId(),
                associado.getId()
        );
        this.voto = voto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Boolean getVoto() {
        return voto;
    }

    public void setVoto(Boolean voto) {
        this.voto = voto;
    }



}
