package br.com.wm.adopet.api.repository.adopet.api.validacoes;

import br.com.wm.adopet.api.repository.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.wm.adopet.api.repository.adopet.api.excpetion.ValidacaoException;
import br.com.wm.adopet.api.repository.adopet.api.model.Pet;
import br.com.wm.adopet.api.repository.adopet.api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidacaoPetDisponivel implements ValidacaoSolicitacaoAdocao {

    @Autowired
    private PetRepository petRepository;

    public void validar(SolicitacaoAdocaoDto dto) {
        Pet pet = petRepository.getReferenceById(dto.idPet());
        if (pet.getAdotado()) {
            throw new ValidacaoException("Pet já foi adotado!");
        }
    }

}
