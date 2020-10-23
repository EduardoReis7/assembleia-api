package com.er.assembleia.services.impl;

import com.er.assembleia.model.Assembleia;
import com.er.assembleia.repository.AssembleiaRepository;
import com.er.assembleia.services.AssembleiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssembleiaServiceImpl implements AssembleiaService {

    @Autowired
    private AssembleiaRepository assembleiaRepository;

    @Override
    public Assembleia save(Assembleia assembleia) {
        return assembleiaRepository.save(assembleia);
    }
}
