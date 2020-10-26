package com.er.assembleia.services;

import com.er.assembleia.model.Assembleia;

public interface AssembleiaService {

    Assembleia save(Assembleia assembleia);
    Assembleia findById(Long id);
    
}
