package com.videostore.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Tim on 1/14/2016.
 */
@Entity
@Table(name = "film_category", schema = "sakila", catalog = "")
@IdClass(FilmCategoryPK.class)
public class FilmCategory {
    private Short filmId;
    private Byte categoryId;
    private Date lastUpdate;

    @Id
    @Column(name = "film_id")
    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    @Id
    @Column(name = "category_id")
    public Byte getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
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

        FilmCategory that = (FilmCategory) o;

        if (filmId != null ? !filmId.equals(that.filmId) : that.filmId != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = filmId != null ? filmId.hashCode() : 0;
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
