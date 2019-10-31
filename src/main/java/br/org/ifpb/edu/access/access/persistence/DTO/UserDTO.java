package br.org.ifpb.edu.access.access.persistence.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

import static br.org.ifpb.edu.access.access.util.RegexUtil.REGISTER_REGEX;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 2508179015169535551L;

    @NotNull(message = "O campo name não pode ser nulo")
    @NotEmpty(message = "O campo name não pode ser vázio")
    private String name;

    @NotNull(message = "O campo email não pode ser nulo")
    @NotEmpty(message = "O campo email não pode ser vázio")
    @Email(message = "'${validatedValue}' não está com um formato de e-mail válido.")
    private String email;

    @NotNull(message = "O campo register não pode ser nulo")
    @NotEmpty(message = "O campo register não pode ser vázio")
    @Pattern(regexp = REGISTER_REGEX, message = "'${validatedValue}' não está no formato de uma matricula válida")
    private String register;

    @NotNull(message = "O campo password não pode ser nulo")
    @NotEmpty(message = "O campo password não pode ser vázio")
    @Min(value = 4, message = "O campo password deve ter no mínimo 4 caracteres")
    @Max(value = 8, message = "O campo password deve ter no máximo 8 caracteres")
    private String password;

    @NotNull(message = "O campo idPerfil não pode ser nulo")
    private Long idPerfil;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }
}
