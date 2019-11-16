package br.org.ifpb.edu.access.access.persistence.DTO;

import java.io.Serializable;

public class PerfilDTO implements Serializable {

    private static final long serialVersionUID = -5085729090644534260L;

    private Long id;

    private String code;

    private String description;

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
