package com.er.assembleia.util;

import com.er.assembleia.model.Assembleia;
import com.er.assembleia.model.dto.AssembleiaDto;
import com.er.assembleia.model.forms.AtualizarAssembleiaForm;
import org.springframework.stereotype.Component;

@Component
public class AssembleiaUtil {

    public Assembleia convertAssembleiaDtoToAssembleia(AssembleiaDto dto) {
        Assembleia entity = new Assembleia();
        entity.setId(dto.getId());
        entity.setTitulo(dto.getTitulo());
        entity.setDescricao(dto.getDescricao());
        entity.setInicioAssembleia(dto.getInicioAssembleia());
        entity.setFimAssembleia(dto.getFimAssembleia());
        entity.setDataCriacao(dto.getDataCriacao());

        return entity;
    }

    public AssembleiaDto convertAssembleiaToAssembleiaDto(Assembleia entity) {
        AssembleiaDto dto = new AssembleiaDto();
        dto.setId(entity.getId());
        dto.setTitulo(entity.getTitulo());
        dto.setDescricao(entity.getDescricao());
        dto.setInicioAssembleia(entity.getInicioAssembleia());
        dto.setFimAssembleia(entity.getFimAssembleia());
        dto.setDataCriacao(entity.getDataCriacao());

        return dto;
    }

    public Assembleia convertAtualizarAssembleiaFormToAssembleia(AtualizarAssembleiaForm form) {
        Assembleia assembleia = new Assembleia();
        assembleia.setTitulo(form.getTitulo());
        assembleia.setDescricao(form.getDescricao());
        assembleia.setInicioAssembleia(form.getInicioAssembleia());
        assembleia.setFimAssembleia(form.getFimAssembleia());

        return assembleia;
    }
}
