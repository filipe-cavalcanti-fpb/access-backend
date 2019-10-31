package br.org.ifpb.edu.access.access.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "access_day")
@SequenceGenerator(name = "access_day_seq", sequenceName = "access_day_seq", allocationSize = 1)
public class Day implements Serializable {

    private static final long serialVersionUID = 2383693640141787822L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "access_day_seq")
    private Long id;

    @NotNull
    @Column(name = "day_of_week")
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    @NotNull
    @Column(name = "time_initials")
    private LocalTime timeInitials;

    @NotNull
    @Column(name = "time_ends")
    private LocalTime timeEnds;

    public Long getId() {
        return id;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getTimeInitials() {
        return timeInitials;
    }

    public void setTimeInitials(LocalTime timeInitials) {
        this.timeInitials = timeInitials;
    }

    public LocalTime getTimeEnds() {
        return timeEnds;
    }

    public void setTimeEnds(LocalTime timeEnds) {
        this.timeEnds = timeEnds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return id.equals(day.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
