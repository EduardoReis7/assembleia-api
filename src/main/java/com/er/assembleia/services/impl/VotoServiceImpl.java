package com.er.assembleia.services.impl;

import com.er.assembleia.model.Associado;
import com.er.assembleia.model.Pauta;
import com.er.assembleia.model.Voto;
import com.er.assembleia.repository.VotoRepository;
import com.er.assembleia.services.AssociadoService;
import com.er.assembleia.services.PautaService;
import com.er.assembleia.services.VotoService;
import org.springframework.stereotype.Service;

@Service
public class VotoServiceImpl implements VotoService {

    private final VotoRepository votoRepository;
    private final PautaService pautaService;
    private final AssociadoService associadoService;

    public VotoServiceImpl(VotoRepository votoRepository, PautaService pautaService, AssociadoService associadoService) {
        this.votoRepository = votoRepository;
        this.pautaService = pautaService;
        this.associadoService = associadoService;
    }

    @Override
    public void salvarVoto(Long pautaId, Boolean votoValue, String cpf) {

        Associado associado = new Associado();
        associado.setCpf(cpf);

        Pauta pauta = pautaService.findById(pautaId);

        if (pauta.getSessao().isAberta()) {
            Voto voto = new Voto(pautaId, votoValue);
            votoRepository.save(voto);
        }
    }
}
