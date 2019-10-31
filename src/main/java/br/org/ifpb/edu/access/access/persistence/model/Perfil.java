package br.org.ifpb.edu.access.access.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "access_perfil")
@SequenceGenerator(name = "access_perfil_seq", sequenceName = "access_perfil_seq", allocationSize = 1)
public class Perfil implements Serializable {

    private static final long serialVersionUID = 7681246559245780867L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "access_perfil_seq")
    private Long id;

    @NotNull
    @Column(name = "code")
    private String code;

    @NotNull
    @Column(name = "description")
    private String description;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perfil perfil = (Perfil) o;
        return id.equals(perfil.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
