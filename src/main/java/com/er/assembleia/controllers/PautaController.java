package com.er.assembleia.controllers;

import com.er.assembleia.model.Assembleia;
import com.er.assembleia.model.Pauta;
import com.er.assembleia.model.dto.PautaDto;
import com.er.assembleia.model.forms.PautaForm;
import com.er.assembleia.services.PautaService;
import com.er.assembleia.util.PautaUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/assembleia/{assembleiaId}/pauta")
public class PautaController {

    private final PautaService pautaService;

    private final PautaUtil pautaUtil;

    public PautaController(PautaService pautaService, PautaUtil pautaUtil) {
        this.pautaService = pautaService;
        this.pautaUtil = pautaUtil;
    }

    @PostMapping
    public ResponseEntity<PautaDto> cadastrarPauta(@RequestBody @Valid PautaForm form, @PathVariable Long assembleiaId) {
        form.setAssembleiaId(assembleiaId);
        Pauta pauta = pautaService.save(pautaUtil.convertPautaFormToPauta(form));

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{pautaId}")
                    .buildAndExpand(pauta.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping(value = "/{pautaId}")
    public ResponseEntity<PautaDto> buscarPauta(@PathVariable Long pautaId) {
        Pauta pauta = pautaService.findById(pautaId);
        PautaDto dto = pautaUtil.convertPautaToPautaDto(pauta);

        return ResponseEntity.ok(dto);
    }
}
