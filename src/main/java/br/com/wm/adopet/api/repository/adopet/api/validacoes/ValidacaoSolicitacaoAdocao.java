package br.com.wm.adopet.api.repository.adopet.api.validacoes;

import br.com.wm.adopet.api.repository.adopet.api.dto.SolicitacaoAdocaoDto;

public interface ValidacaoSolicitacaoAdocao {

    void validar(SolicitacaoAdocaoDto dto);

}
