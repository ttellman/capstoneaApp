package com.videostore.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Tim on 1/14/2016.
 */
@Entity
@Table(name = "film_actor", schema = "sakila", catalog = "")
@IdClass(FilmActorPK.class)
public class FilmActor {
    private Short actorId;
    private Short filmId;
    private Date lastUpdate;

    @Id
    @Column(name = "actor_id")
    public Short getActorId() {
        return actorId;
    }

    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }

    @Id
    @Column(name = "film_id")
    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    @Basic
    @Column(name = "last_update")
    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmActor filmActor = (FilmActor) o;

        if (actorId != null ? !actorId.equals(filmActor.actorId) : filmActor.actorId != null) return false;
        if (filmId != null ? !filmId.equals(filmActor.filmId) : filmActor.filmId != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(filmActor.lastUpdate) : filmActor.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = actorId != null ? actorId.hashCode() : 0;
        result = 31 * result + (filmId != null ? filmId.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
