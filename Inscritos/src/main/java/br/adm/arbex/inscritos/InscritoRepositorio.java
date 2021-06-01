package br.adm.arbex.inscritos;

import org.springframework.data.repository.CrudRepository;

import br.adm.arbex.inscritos.Inscrito;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface InscritoRepositorio extends CrudRepository<Inscrito, Integer> {

}