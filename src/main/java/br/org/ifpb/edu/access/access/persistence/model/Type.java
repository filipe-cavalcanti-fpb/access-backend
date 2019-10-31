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
@Table(name = "access_type")
@SequenceGenerator(name = "access_type_seq", sequenceName = "access_type_seq", allocationSize = 1)
public class Type implements Serializable {

    private static final long serialVersionUID = 4507800974229359151L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "access_type_seq")
    private Long id;

    @NotNull
    @Column(name = "codigo")
    private String codigo;

    @NotNull
    @Column(name = "descricao")
    private String descricao;

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(id, type.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
