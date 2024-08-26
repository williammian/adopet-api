package br.com.wm.adopet.api.repository.adopet.api.dto;

import br.com.wm.adopet.api.repository.adopet.api.model.Abrigo;

public record AbrigoDto(Long id, String nome) {

    public AbrigoDto(Abrigo abrigo) {
        this(abrigo.getId(), abrigo.getNome());
    }

}
