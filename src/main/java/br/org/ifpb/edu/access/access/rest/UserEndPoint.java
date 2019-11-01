package br.org.ifpb.edu.access.access.rest;

import br.org.ifpb.edu.access.access.persistence.DTO.MessageDTO;
import br.org.ifpb.edu.access.access.persistence.DTO.UserDTO;
import br.org.ifpb.edu.access.access.service.declaration.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController("users")
@RequestMapping("users")
public class UserEndPoint {

    private final UserService userService;

    public UserEndPoint(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<String> getMapping() {
        return Arrays.asList("filipe", "cazuza", "cavalcanti");
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public MessageDTO createUser(@RequestBody @Valid UserDTO userDTO) {
        return new MessageDTO("bora");
    }
}
