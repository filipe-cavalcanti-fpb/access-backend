package br.org.ifpb.edu.access.access.service.implementation;

import br.org.ifpb.edu.access.access.persistence.DAO.UserDAO;
import br.org.ifpb.edu.access.access.persistence.DAO.genericDAO.GenericDAO;
import br.org.ifpb.edu.access.access.persistence.DTO.MessageDTO;
import br.org.ifpb.edu.access.access.persistence.DTO.UserDTO;
import br.org.ifpb.edu.access.access.persistence.model.User;
import br.org.ifpb.edu.access.access.service.declaration.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MessageDTO createUser(UserDTO userDTO) {
        return null;
    }
}
