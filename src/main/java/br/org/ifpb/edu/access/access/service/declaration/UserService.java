package br.org.ifpb.edu.access.access.service.declaration;

import br.org.ifpb.edu.access.access.persistence.DTO.MessageDTO;
import br.org.ifpb.edu.access.access.persistence.DTO.UserDTO;

public interface UserService {

    MessageDTO createUser(final UserDTO userDTO);
}
