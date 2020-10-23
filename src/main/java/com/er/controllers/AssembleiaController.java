package com.er.controllers;

import com.er.model.Assembleia;
import com.er.model.dto.AssembleiaDto;
import com.er.services.AssembleiaService;
import com.er.util.AssembleiaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assembleia")
public class AssembleiaController {

    @Autowired
    private AssembleiaService assembleiaService;

    public ResponseEntity<Assembleia> cadastrar(AssembleiaDto dto) {
        Assembleia assembleia = assembleiaService.save(AssembleiaUtil.convertAssembleiaDtoToAssembleia(dto));

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
