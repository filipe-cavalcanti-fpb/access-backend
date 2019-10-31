package br.org.ifpb.edu.access.access.persistence.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "access_access")
@SequenceGenerator(name = "access_access_seq", sequenceName = "access_access_seq", initialValue = 1)
public class Access implements Serializable {

    private static final long serialVersionUID = 7108579047221726814L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "access_access_seq")
    private Long id;

    @NotNull
    @Column(name = "has_total_access")
    private Boolean hasTotalAccess;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "fk_access", foreignKey = @ForeignKey(name = "fk_day_access"))
    private List<Day> daysAllowed;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_key", foreignKey = @ForeignKey(name = "fk_access_key"))
    private Key key;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_name", foreignKey = @ForeignKey(name = "fk_access_user"))
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getHasTotalAccess() {
        return hasTotalAccess;
    }

    public void setHasTotalAccess(Boolean hasTotalAccess) {
        this.hasTotalAccess = hasTotalAccess;
    }

    public List<Day> getDaysAllowed() {
        return daysAllowed;
    }

    public void setDaysAllowed(List<Day> daysAllowed) {
        this.daysAllowed = daysAllowed;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Access access = (Access) o;
        return id.equals(access.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
