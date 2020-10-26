package com.er.assembleia.controllers;

import com.er.assembleia.model.Assembleia;
import com.er.assembleia.model.dto.AssembleiaDto;
import com.er.assembleia.services.AssembleiaService;
import com.er.assembleia.util.AssembleiaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/assembleia")
public class AssembleiaController {

    @Autowired
    private AssembleiaService assembleiaService;

    @PostMapping
    public ResponseEntity<Assembleia> cadastrar(@Valid @RequestBody AssembleiaDto dto) {
        Assembleia assembleia = assembleiaService.save(AssembleiaUtil.convertAssembleiaDtoToAssembleia(dto));

        return ResponseEntity.status(HttpStatus.CREATED).body(assembleia);
    }

    @GetMapping( value = "/{id}")
    public ResponseEntity<AssembleiaDto> buscarAssembleiaPorId(@PathVariable Long id) {
        Assembleia assembleia = assembleiaService.findById(id);
        AssembleiaDto dto = AssembleiaUtil.convertAssembleiaToAssembleiaDto(assembleia);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<AssembleiaDto>> listarAssembleias(Pageable pageable) {
        Page<Assembleia> assembleiaPage = assembleiaService.findAll(pageable);
        Page<AssembleiaDto> assembleiaDtoPage = assembleiaPage.map(AssembleiaUtil::convertAssembleiaToAssembleiaDto);
        return ResponseEntity.ok(assembleiaDtoPage);
    }


}
