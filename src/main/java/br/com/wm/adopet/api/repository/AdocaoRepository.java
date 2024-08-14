package br.com.wm.adopet.api.repository;

import br.com.wm.adopet.api.model.Adocao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {

}
