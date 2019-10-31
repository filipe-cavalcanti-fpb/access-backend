package br.org.ifpb.edu.access.access.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "access_user")
@SequenceGenerator(name = "access_user_seq", sequenceName = "access_user_seq")
public class User implements Serializable {

    private static final long serialVersionUID = -2448555473694828104L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "access_user_seq")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Pattern(regexp = "^[0-9]{12}|[0-9]{6}$")
    @Column(name = "register")
    private String register;

    @NotNull
    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_perfil", foreignKey = @ForeignKey(name = "fk_user_perfil"))
    private Perfil perfil;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
