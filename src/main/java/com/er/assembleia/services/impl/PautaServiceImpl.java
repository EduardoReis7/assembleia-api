package com.er.assembleia.services.impl;

import com.er.assembleia.model.Pauta;
import com.er.assembleia.repository.PautaRepository;
import com.er.assembleia.services.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PautaServiceImpl implements PautaService {

    @Autowired
    private PautaRepository pautaRepository;

    @Override
    public Pauta save(Pauta pauta) {
        pauta.setDataCriacao(LocalDateTime.now());
        return (Pauta) pautaRepository.save(pauta);
    }
}
