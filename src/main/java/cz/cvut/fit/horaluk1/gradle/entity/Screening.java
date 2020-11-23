package cz.cvut.fit.horaluk1.gradle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private Date time;

    @NotNull
    private boolean is3D;

    @ManyToOne
    @NotNull
    private Auditorium auditorium;

    @ManyToOne
    @NotNull
    private Movie movie;

    public Screening() {
    }

    public Screening(Date time, boolean is3D, Auditorium auditorium, Movie movie) {
        this.time = time;
        this.is3D = is3D;
        this.auditorium = auditorium;
        this.movie = movie;
    }

    public int getId() {
        return id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public Auditorium getAuditorium() { return auditorium; }

    public void setAuditorium(Auditorium auditorium) { this.auditorium = auditorium; }

    public Movie getMovie() { return movie; }

    public void setMovie(Movie movie) { this.movie = movie; }
}