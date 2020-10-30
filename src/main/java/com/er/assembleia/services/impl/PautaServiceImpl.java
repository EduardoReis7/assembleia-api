package com.er.assembleia.services.impl;

import com.er.assembleia.model.Assembleia;
import com.er.assembleia.model.Pauta;
import com.er.assembleia.repository.AssembleiaRepository;
import com.er.assembleia.repository.PautaRepository;
import com.er.assembleia.services.PautaService;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PautaServiceImpl implements PautaService {

    private final PautaRepository pautaRepository;
    private final AssembleiaRepository assembleiaRepository;

    public PautaServiceImpl(PautaRepository pautaRepository, AssembleiaRepository assembleiaRepository) {
        this.pautaRepository = pautaRepository;
        this.assembleiaRepository = assembleiaRepository;
    }

    @Override
    public Pauta save(Pauta pauta) {
        pauta.setDataCriacao(LocalDateTime.now());
        Optional<Assembleia> optAssembleia = assembleiaRepository.findById(pauta.getAssembleia().getId());

        return (Pauta) pautaRepository.save(pauta);
    }

    @Override
    public Pauta findById(Long pautaId) {
        Optional<Pauta> optPauta = pautaRepository.findById(pautaId);
        return optPauta.orElse(null);
    }

    @Override
    public void delete(Long pautaId) {
        pautaRepository.findById(pautaId);
        pautaRepository.deleteById(pautaId);
    }
}
