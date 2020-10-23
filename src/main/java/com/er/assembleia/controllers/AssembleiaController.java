package com.er.assembleia.controllers;

import com.er.assembleia.model.Assembleia;
import com.er.assembleia.model.dto.AssembleiaDto;
import com.er.assembleia.services.AssembleiaService;
import com.er.assembleia.util.AssembleiaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assembleia")
public class AssembleiaController {

    @Autowired
    private AssembleiaService assembleiaService;

    @PostMapping
    public ResponseEntity<Assembleia> cadastrar(AssembleiaDto dto) {
        Assembleia assembleia = assembleiaService.save(AssembleiaUtil.convertAssembleiaDtoToAssembleia(dto));

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
