package br.org.ifpb.edu.access.access.persistence.DAO.genericDAO;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Optional;

public class GenericDAO<T, I extends Serializable> {

    @PersistenceContext
    private EntityManager em;

    private Class<T> clazz;

    public Optional<T> consultarPorID(I id) throws PersistenceException {
        return Optional.ofNullable(this.em.find(clazz, id));
    }

    public T save(@Valid T t) throws PersistenceException {
        this.em.persist(t);
        return t;
    }

    public T update(@Valid T t) throws PersistenceException {
        this.em.merge(t);
        return t;
    }

    public void remove(T t) throws PersistenceException {
        this.em.remove(t);
    }

    public EntityManager getEntityManager() {
        return this.em;
    }
}
