package com.er.assembleia.services.impl;

import com.er.assembleia.exceptions.VotoException;
import com.er.assembleia.model.Associado;
import com.er.assembleia.model.Pauta;
import com.er.assembleia.model.Voto;
import com.er.assembleia.repository.VotoRepository;
import com.er.assembleia.services.AssociadoService;
import com.er.assembleia.services.PautaService;
import com.er.assembleia.services.VotoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

        Associado associado = associadoService.findByCpf(cpf);

        Optional<Voto> optVoto = votoRepository.findByVotoAssociadoPautaPautaIdAndVotoAssociadoPautaAssociadoId(pautaId, associado.getId());
        if ( optVoto.isPresent()) {
            throw new VotoException("Voto já cadastrado no sistema.");
        }

        Pauta pauta = pautaService.findById(pautaId);

        if (pauta.getSessao().isAberta()) {
            Voto voto = new Voto(pauta , votoValue, associado);
            votoRepository.save(voto);
        } else {
            throw new VotoException("A sessão de votação para a pauta informada encontra-se fechada.");
        }
    }
}