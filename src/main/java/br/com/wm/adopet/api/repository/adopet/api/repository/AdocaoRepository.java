package br.com.wm.adopet.api.repository.adopet.api.repository;

import br.com.wm.adopet.api.repository.adopet.api.model.Adocao;
import br.com.wm.adopet.api.repository.adopet.api.model.StatusAdocao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {

    boolean existsByPetIdAndStatus(Long idPet, StatusAdocao status);

}