package com.er.assembleia.services;

import com.er.assembleia.model.Voto;

public interface VotoService {
    void salvarVoto(Long pautaId, Boolean votoValue);
}
