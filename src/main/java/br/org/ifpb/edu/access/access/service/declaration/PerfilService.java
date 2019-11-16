package br.org.ifpb.edu.access.access.service.declaration;

import br.org.ifpb.edu.access.access.persistence.model.Perfil;

import java.util.Optional;

public interface PerfilService {

    Optional<Perfil> consultarPorId(Long id);
}
