package com.er.assembleia.controllers;

import com.er.assembleia.model.Associado;
import com.er.assembleia.model.forms.VotoForm;
import com.er.assembleia.services.VotoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/voto")
public class VotoController {

    private final VotoService votoService;

    public VotoController(VotoService votoService) {
        this.votoService = votoService;
    }

    @PostMapping
    public ResponseEntity<?> salvarVoto(@Valid @RequestBody VotoForm form, String cpf) {
        votoService.salvarVoto(form.getPautaId(), form.getVoto(), cpf);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
