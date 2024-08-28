package br.com.wm.adopet.api.validacoes;

import br.com.wm.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.wm.adopet.api.exception.ValidacaoException;
import br.com.wm.adopet.api.model.Adocao;
import br.com.wm.adopet.api.model.StatusAdocao;
import br.com.wm.adopet.api.model.Tutor;
import br.com.wm.adopet.api.repository.AdocaoRepository;
import br.com.wm.adopet.api.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ValidacaoTutorComLimiteDeAdocoes implements ValidacaoSolicitacaoAdocao {

    @Autowired
    private AdocaoRepository adocaoRepository;

    public void validar(SolicitacaoAdocaoDto dto) {
        Integer adocoesTutor = adocaoRepository.countByTutorIdAndStatus(dto.idTutor(), StatusAdocao.APROVADO);
        if (adocoesTutor == 5) {
            throw new ValidacaoException("Tutor chegou ao limite máximo de 5 adoções!");
        }
    }

}
