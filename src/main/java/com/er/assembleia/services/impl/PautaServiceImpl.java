package com.er.assembleia.services.impl;

import com.er.assembleia.model.Pauta;
import com.er.assembleia.repository.PautaRepository;
import com.er.assembleia.services.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PautaServiceImpl implements PautaService {

    @Autowired
    private PautaRepository pautaRepository;

    @Override
    public Pauta save(Pauta pauta) {
        pauta.setDataCriacao(LocalDateTime.now());
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
