package br.org.ifpb.edu.access.access;

import br.org.ifpb.edu.access.access.service.declaration.AccessService;
import br.org.ifpb.edu.access.access.service.implementation.AccessServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccessServiceTest {
    private AccessService accessService;

    @BeforeEach
    void initAccessService() {
        this.accessService = new AccessServiceImpl();
    }

    @Test
    void aTest() {
        assertEquals("", this.accessService.a());
    }
}
