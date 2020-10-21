package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "voto")
public class Voto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean voto;

    public Boolean getVoto() {
        return voto;
    }

    public void setVoto(Boolean voto) {
        this.voto = voto;
    }
}
