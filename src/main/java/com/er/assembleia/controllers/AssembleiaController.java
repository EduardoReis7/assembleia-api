package com.er.assembleia.controllers;

import com.er.assembleia.model.Assembleia;
import com.er.assembleia.model.dto.AssembleiaDto;
import com.er.assembleia.model.forms.AtualizarAssembleiaForm;
import com.er.assembleia.services.AssembleiaService;
import com.er.assembleia.util.AssembleiaUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/assembleia")
public class AssembleiaController {

    private final AssembleiaService assembleiaService;

    private final AssembleiaUtil assembleiaUtil;

    public AssembleiaController(AssembleiaService assembleiaService, AssembleiaUtil assembleiaUtil) {
        this.assembleiaService = assembleiaService;
        this.assembleiaUtil = assembleiaUtil;
    }

    @PostMapping
    public ResponseEntity<Assembleia> cadastrar(@Valid @RequestBody AssembleiaDto dto) {
        Assembleia assembleia = assembleiaService.save(assembleiaUtil.convertAssembleiaDtoToAssembleia(dto));

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{assembleiaId}")
                    .buildAndExpand(assembleia.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping( value = "/{id}")
    public ResponseEntity<AssembleiaDto> buscarAssembleiaPorId(@PathVariable Long id) {
        Assembleia assembleia = assembleiaService.findById(id);
        AssembleiaDto dto = assembleiaUtil.convertAssembleiaToAssembleiaDto(assembleia);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<AssembleiaDto>> listarAssembleias(Pageable pageable) {
        Page<Assembleia> assembleiaPage = assembleiaService.findAll(pageable);
        Page<AssembleiaDto> assembleiaDtoPage = assembleiaPage.map(assembleiaUtil::convertAssembleiaToAssembleiaDto);
        return ResponseEntity.ok(assembleiaDtoPage);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deletarAssembleia(@PathVariable Long id) {
        assembleiaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<AssembleiaDto> atualizarAssembleia(@PathVariable Long id, @Valid @RequestBody AtualizarAssembleiaForm form) {
        Assembleia assembleia = assembleiaUtil.convertAtualizarAssembleiaFormToAssembleia(form);
        assembleia.setId(id);
        assembleia = assembleiaService.update(assembleia);

        return  ResponseEntity.ok(assembleiaUtil.convertAssembleiaToAssembleiaDto(assembleia));
    }


}
