package com.er.services.impl;

import com.er.model.Assembleia;
import com.er.repository.AssembleiaRepository;
import com.er.services.AssembleiaService;
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
