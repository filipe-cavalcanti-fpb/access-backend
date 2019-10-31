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
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "access_reserve")
@SequenceGenerator(name = "access_reserve_seq", sequenceName = "access_reserve_seq", initialValue = 1)
public class Reserve implements Serializable {

    private static final long serialVersionUID = 3526167349955838823L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "access_reserve_seq")
    private Long id;

    @NotNull
    @Column(name = "date")
    private LocalDate date;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_day", foreignKey = @ForeignKey(name = "fk_reserve_day"))
    private Day day;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_room", foreignKey = @ForeignKey(name = "fk_reserve_room"))
    private Room room;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_user", foreignKey = @ForeignKey(name = "fk_reserve_user"))
    private User user;

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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
        Reserve reserve = (Reserve) o;
        return id.equals(reserve.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
