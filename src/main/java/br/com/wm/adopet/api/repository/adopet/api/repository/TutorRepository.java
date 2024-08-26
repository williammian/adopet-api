package br.com.wm.adopet.api.repository.adopet.api.repository;

import br.com.wm.adopet.api.repository.adopet.api.model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

    boolean existsByTelefoneOrEmail(String telefone, String email);

}
