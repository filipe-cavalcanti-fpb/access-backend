package br.org.ifpb.edu.access.access.persistence.DTO;

import java.io.Serializable;

public class MessageDTO implements Serializable {

    private static final long serialVersionUID = 916010856267107903L;

    private String message;

    public MessageDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
