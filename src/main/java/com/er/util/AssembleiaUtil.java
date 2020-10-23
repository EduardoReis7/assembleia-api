package com.er.util;

import com.er.model.Assembleia;
import com.er.model.dto.AssembleiaDto;

public class AssembleiaUtil {

    public static Assembleia convertAssembleiaDtoToAssembleia(AssembleiaDto dto) {
        Assembleia entity = new Assembleia();
        entity.setId(dto.getId());
        entity.setTitulo(dto.getTitulo());
        entity.setDescricao(dto.getDescricao());
        entity.setDataAssembleia(dto.getDataAssembleia());
        entity.setDataCriacao(dto.getDataCriação());

        return entity;
    }

    public static AssembleiaDto convertAssembleiaToAssembleiaDto(Assembleia entity) {
        AssembleiaDto dto = new AssembleiaDto();
        dto.setId(entity.getId());
        dto.setTitulo(entity.getTitulo());
        dto.setDescricao(entity.getDescricao());
        dto.setDataAssembleia(entity.getDataAssembleia());
        dto.setDataCriação(entity.getDataCriacao());

        return dto;
    }
}
