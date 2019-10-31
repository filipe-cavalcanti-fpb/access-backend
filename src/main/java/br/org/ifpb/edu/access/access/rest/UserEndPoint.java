package br.org.ifpb.edu.access.access.rest;

import br.org.ifpb.edu.access.access.service.declaration.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("users")
public class UserEndPoint {

    private final UserService userService;

    public UserEndPoint(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<String>> consultarNomes() {

        return ResponseEntity.ok().body(new ArrayList<>());
    }
}
