package br.com.wm.adopet.api.repository.adopet.api.dto;

import br.com.wm.adopet.api.repository.adopet.api.model.Pet;
import br.com.wm.adopet.api.repository.adopet.api.model.TipoPet;

public record PetDto(Long id, TipoPet tipo, String nome, String raca, Integer idade) {

    public PetDto(Pet pet) {
        this(pet.getId(), pet.getTipo(), pet.getNome(), pet.getRaca(), pet.getIdade());
    }

}
