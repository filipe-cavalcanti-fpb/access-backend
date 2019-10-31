package br.org.ifpb.edu.access.access.service.implementation;

import br.org.ifpb.edu.access.access.persistence.DTO.MessageDTO;
import br.org.ifpb.edu.access.access.persistence.DTO.UserDTO;
import br.org.ifpb.edu.access.access.service.declaration.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class UserServiceImpl implements UserService {

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MessageDTO createUser(UserDTO userDTO) {
        return null;
    }
}
