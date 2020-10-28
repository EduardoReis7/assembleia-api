package com.er.assembleia.services;

import com.er.assembleia.model.Associado;

public interface AssociadoService {
    Associado save(Associado associado);
    Associado findById(Long id);
    Associado findByCpf(String cpf);
}
