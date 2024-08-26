package br.com.wm.adopet.api.repository.adopet.api.service;

import br.com.wm.adopet.api.repository.adopet.api.dto.AtualizacaoTutorDto;
import br.com.wm.adopet.api.repository.adopet.api.dto.CadastroTutorDto;
import br.com.wm.adopet.api.repository.adopet.api.excpetion.ValidacaoException;
import br.com.wm.adopet.api.repository.adopet.api.model.Tutor;
import br.com.wm.adopet.api.repository.adopet.api.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorService {

    @Autowired
    private TutorRepository repository;

    public void cadastrar(CadastroTutorDto dto) {
        boolean jaCadastrado = repository.existsByTelefoneOrEmail(dto.telefone(), dto.email());

        if (jaCadastrado) {
            throw new ValidacaoException("Dados já cadastrados para outro tutor!");
        }

        repository.save(new Tutor(dto));
    }

    public void atualizar(AtualizacaoTutorDto dto) {
        Tutor tutor = repository.getReferenceById(dto.id());
        tutor.atualizarDados(dto);
    }

}