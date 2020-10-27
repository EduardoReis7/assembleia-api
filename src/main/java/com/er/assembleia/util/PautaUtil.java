package com.er.assembleia.util;

import com.er.assembleia.model.Assembleia;
import com.er.assembleia.model.Pauta;
import com.er.assembleia.model.Sessao;
import com.er.assembleia.model.dto.PautaDto;
import com.er.assembleia.model.forms.PautaForm;
import com.er.assembleia.services.AssembleiaService;
import org.springframework.stereotype.Component;

@Component
public class PautaUtil {

    private final AssembleiaService assembleiaService;

    public PautaUtil(AssembleiaService assembleiaService) {
        this.assembleiaService = assembleiaService;
    }

    public Pauta convertPautaFormToPauta(PautaForm form) {
        Pauta pauta = new Pauta();
        pauta.setTitulo(form.getTitulo());
        pauta.setDescricao(form.getDescricao());

        Sessao sessao = new Sessao();
        sessao.setInicioSessao(form.getInicioSessao());
        sessao.setDuracaoSessao(form.getDuracao());
        pauta.setSessao(sessao);
        
        Assembleia assembleia = assembleiaService.findById(form.getAssembleiaId());
        pauta.setAssembleia(assembleia);

        return pauta;
    }

    public PautaDto convertPautaToPautaDto(Pauta pauta) {
        PautaDto dto = new PautaDto();
        dto.setId(pauta.getId());
        dto.setTitulo(pauta.getTitulo());
        dto.setDescricao(pauta.getDescricao());
        dto.setDataCriacao(pauta.getDataCriacao());
        dto.setInicioSessao(pauta.getSessao().getInicioSessao());
        dto.setDuracao(pauta.getSessao().getDuracaoSessao());

        return dto;
    }
}
