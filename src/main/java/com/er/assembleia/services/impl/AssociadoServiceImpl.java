package com.er.assembleia.services.impl;

import com.er.assembleia.model.Associado;
import com.er.assembleia.repository.AssociadoRepository;
import com.er.assembleia.services.AssociadoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssociadoServiceImpl implements AssociadoService {

    private final AssociadoRepository associadoRepository;

    public AssociadoServiceImpl(AssociadoRepository associadoRepository) {
        this.associadoRepository = associadoRepository;
    }

    @Override
    public Associado save(Associado associado) {
        return associadoRepository.save(associado);
    }

    @Override
    public Associado findByCpf(String cpf) {
        Optional<Associado> optAssociado = associadoRepository.findByCpf(cpf);

        return optAssociado.orElse(null);
    }

    @Override
    public Associado findById(Long id) {
        Optional<Associado> optAssociado = associadoRepository.findById(id);
        return optAssociado.orElse(null);
    }
}
