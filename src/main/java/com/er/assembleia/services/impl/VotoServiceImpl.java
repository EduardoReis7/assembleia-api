package com.er.assembleia.services.impl;

import com.er.assembleia.model.Pauta;
import com.er.assembleia.model.Voto;
import com.er.assembleia.repository.VotoRepository;
import com.er.assembleia.services.PautaService;
import com.er.assembleia.services.VotoService;
import org.springframework.stereotype.Service;

@Service
public class VotoServiceImpl implements VotoService {

    private final VotoRepository votoRepository;
    private final PautaService pautaService;

    public VotoServiceImpl(VotoRepository votoRepository, PautaService pautaService) {
        this.votoRepository = votoRepository;
        this.pautaService = pautaService;
    }

    @Override
    public void salvarVoto(Long pautaId, Boolean votoValue) {

        Pauta pauta = pautaService.findById(pautaId);

        if (pauta.getSessao().isAberta()) {
            Voto voto = new Voto(pautaId, votoValue);
            votoRepository.save(voto);
        }
    }
}
