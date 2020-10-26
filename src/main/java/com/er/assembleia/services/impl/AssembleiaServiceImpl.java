package com.er.assembleia.services.impl;

import com.er.assembleia.model.Assembleia;
import com.er.assembleia.repository.AssembleiaRepository;
import com.er.assembleia.services.AssembleiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssembleiaServiceImpl implements AssembleiaService {

    @Autowired
    private AssembleiaRepository assembleiaRepository;

    @Override
    public Assembleia save(Assembleia assembleia) {
        return assembleiaRepository.save(assembleia);
    }

    @Override
    public Assembleia findById(Long id) {
        Optional<Assembleia> assembleia = assembleiaRepository.findById(id);
        return assembleia.orElse(null);
    }

    @Override
    public Page<Assembleia> findAll(Pageable pageable) {
        return assembleiaRepository.findAll(pageable);
    }

    @Override
    public void deleteById(Long id) {
        assembleiaRepository.findById(id);
        assembleiaRepository.deleteById(id);
    }
}
