package com.er.assembleia.services;

import com.er.assembleia.model.Associado;

public interface VotoService {
    void salvarVoto(Long pautaId, Boolean votoValue, String cpf);
}
