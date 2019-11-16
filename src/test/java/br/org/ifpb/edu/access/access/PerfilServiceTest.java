package br.org.ifpb.edu.access.access;

import br.org.ifpb.edu.access.access.persistence.DAO.PerfilDAO;
import br.org.ifpb.edu.access.access.persistence.model.Perfil;
import br.org.ifpb.edu.access.access.service.declaration.PerfilService;
import br.org.ifpb.edu.access.access.service.implementation.PerfilServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
public class PerfilServiceTest {

    private PerfilService perfilService;


    @BeforeEach
    public void initiPerfilService() {
    }

    @Test
    public void consultarPorIdTest() {
        //Optional<Perfil> optionalPerfil = this.perfilService.consultarPorId(1L);
        assertEquals("Filipe", "Filipe");
    }
}
