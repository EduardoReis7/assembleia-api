package com.er.assembleia.services;

import com.er.assembleia.model.Assembleia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AssembleiaService {

    Assembleia save(Assembleia assembleia);
    Assembleia findById(Long id);
    Page<Assembleia> findAll(Pageable pageable);
    void deleteById(Long id);
    Assembleia update(Assembleia assembleia);
    
}
