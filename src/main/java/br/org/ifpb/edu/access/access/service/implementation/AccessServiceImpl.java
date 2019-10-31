package br.org.ifpb.edu.access.access.service.implementation;

import br.org.ifpb.edu.access.access.service.declaration.AccessService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class AccessServiceImpl implements AccessService {

    @Override
    public String a() {
        return "";
    }
}
