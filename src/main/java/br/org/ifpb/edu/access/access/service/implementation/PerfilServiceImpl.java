package br.org.ifpb.edu.access.access.service.implementation;

import br.org.ifpb.edu.access.access.persistence.DAO.PerfilDAO;
import br.org.ifpb.edu.access.access.persistence.model.Perfil;
import br.org.ifpb.edu.access.access.service.declaration.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class PerfilServiceImpl implements PerfilService {

    private PerfilDAO perfilDAO;

    @Autowired
    public PerfilServiceImpl(PerfilDAO perfilDAO) {
        this.perfilDAO = perfilDAO;
    }

    @Override
    public Optional<Perfil> consultarPorId(Long id) {
        return perfilDAO.consultarPorID(id);
    }
}
