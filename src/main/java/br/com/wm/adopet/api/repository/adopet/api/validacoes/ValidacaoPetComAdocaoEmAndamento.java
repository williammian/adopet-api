package br.com.wm.adopet.api.repository.adopet.api.validacoes;

import br.com.wm.adopet.api.repository.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.wm.adopet.api.repository.adopet.api.excpetion.ValidacaoException;
import br.com.wm.adopet.api.repository.adopet.api.model.StatusAdocao;
import br.com.wm.adopet.api.repository.adopet.api.repository.AdocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidacaoPetComAdocaoEmAndamento implements ValidacaoSolicitacaoAdocao {

    @Autowired
    private AdocaoRepository adocaoRepository;

    public void validar(SolicitacaoAdocaoDto dto) {
        boolean petTemAdocaoEmAndamento = adocaoRepository
                .existsByPetIdAndStatus(dto.idPet(), StatusAdocao.AGUARDANDO_AVALIACAO);

        if (petTemAdocaoEmAndamento) {
            throw new ValidacaoException("Pet já está aguardando avaliação para ser adotado!");
        }
    }

}
