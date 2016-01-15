package com.videostore.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Tim on 1/14/2016.
 */
@Entity
@Table(name = "film_list", schema = "sakila", catalog = "")
public class FilmList {
    private Short fid;
    private String title;
    private String description;
    private String category;
    private BigDecimal price;
    private Short length;
    private String rating;
    private String actors;

    @Id
    @Column(name = "FID")
    public Short getFid() {
        return fid;
    }

    public void setFid(Short fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "length")
    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    @Basic
    @Column(name = "rating")
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "actors")
    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmList filmList = (FilmList) o;

        if (fid != null ? !fid.equals(filmList.fid) : filmList.fid != null) return false;
        if (title != null ? !title.equals(filmList.title) : filmList.title != null) return false;
        if (description != null ? !description.equals(filmList.description) : filmList.description != null)
            return false;
        if (category != null ? !category.equals(filmList.category) : filmList.category != null) return false;
        if (price != null ? !price.equals(filmList.price) : filmList.price != null) return false;
        if (length != null ? !length.equals(filmList.length) : filmList.length != null) return false;
        if (rating != null ? !rating.equals(filmList.rating) : filmList.rating != null) return false;
        if (actors != null ? !actors.equals(filmList.actors) : filmList.actors != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (actors != null ? actors.hashCode() : 0);
        return result;
    }
}