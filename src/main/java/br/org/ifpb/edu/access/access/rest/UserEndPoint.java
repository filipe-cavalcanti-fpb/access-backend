package br.org.ifpb.edu.access.access.rest;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("users")
@Api(value = "EndPoint para os recursos de usuários")
public class UserEndPoint {

    @GetMapping
    public ResponseEntity<List<String>> consultarNomes() {
        return ResponseEntity.ok().body(new ArrayList<>());
    }
}
