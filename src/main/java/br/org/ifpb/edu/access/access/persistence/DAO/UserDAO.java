package br.org.ifpb.edu.access.access.persistence.DAO;

import br.org.ifpb.edu.access.access.persistence.DAO.genericDAO.GenericDAO;
import br.org.ifpb.edu.access.access.persistence.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDAO extends GenericDAO<User, Long> {

}
