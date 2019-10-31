package br.org.ifpb.edu.access.access.service;

import br.org.ifpb.edu.access.access.persistence.DTO.UserDTO;
import br.org.ifpb.edu.access.access.persistence.model.Perfil;
import br.org.ifpb.edu.access.access.persistence.model.User;

public class UserMapper {

    public static User mapper(UserDTO userDTO, Perfil perfil) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setPerfil(perfil);
        user.setRegister(userDTO.getRegister());
        return user;
    }
}
