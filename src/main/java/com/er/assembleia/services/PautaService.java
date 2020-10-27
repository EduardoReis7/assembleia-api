package com.er.assembleia.services;

import com.er.assembleia.model.Pauta;
import org.springframework.data.domain.Page;

public interface PautaService {

    Pauta save(Pauta pauta);
    Pauta findById(Long pautaId);
}
