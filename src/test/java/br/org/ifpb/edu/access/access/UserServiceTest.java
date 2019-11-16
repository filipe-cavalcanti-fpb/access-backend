package br.org.ifpb.edu.access.access;

import br.org.ifpb.edu.access.access.persistence.DTO.UserDTO;
import br.org.ifpb.edu.access.access.service.declaration.UserService;
import br.org.ifpb.edu.access.access.service.implementation.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach
    public void initUserService() {
        this.userService = new UserServiceImpl();
    }

    @Test
    public void createUserTest() {
        assertEquals("", "");
    }

    private UserDTO createUserDTO() {
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail("filipe@gmail.com");
        userDTO.setIdPerfil(1L);
        userDTO.setName("Filipe Cazuza");
        userDTO.setPassword("123123123");
        userDTO.setRegister("201611250014");
        return userDTO;
    }
}
