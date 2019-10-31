package br.org.ifpb.edu.access.access.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "access_key")
@SequenceGenerator(name = "access_key_seq", sequenceName = "access_key_seq", allocationSize = 1)
public class Key implements Serializable {

    private static final long serialVersionUID = 4666862707724769883L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "access_key_seq")
    private Long id;

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return id.equals(key.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
