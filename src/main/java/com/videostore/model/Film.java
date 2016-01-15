package com.videostore.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Tim on 1/14/2016.
 */
@Entity
public class Film {
    private Short filmId;
    private String title;
    private String description;
    private Date releaseYear;
    private Byte languageId;
    private Byte originalLanguageId;
    private Byte rentalDuration;
    private BigDecimal rentalRate;
    private Short length;
    private BigDecimal replacementCost;
    private String rating;
    private String specialFeatures;
    private Date lastUpdate;

    @Id
    @Column(name = "film_id")
    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
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
    @Temporal(TemporalType.DATE)
    @Column(name = "release_year")
    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Basic
    @Column(name = "language_id")
    public Byte getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    @Basic
    @Column(name = "original_language_id")
    public Byte getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Byte originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    @Basic
    @Column(name = "rental_duration")
    public Byte getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    @Basic
    @Column(name = "rental_rate")
    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
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
    @Column(name = "replacement_cost")
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
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
    @Column(name = "special_features")
    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    @Basic
    @Temporal(TemporalType.DATE)
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

        Film film = (Film) o;

        if (filmId != null ? !filmId.equals(film.filmId) : film.filmId != null) return false;
        if (title != null ? !title.equals(film.title) : film.title != null) return false;
        if (description != null ? !description.equals(film.description) : film.description != null) return false;
        if (releaseYear != null ? !releaseYear.equals(film.releaseYear) : film.releaseYear != null) return false;
        if (languageId != null ? !languageId.equals(film.languageId) : film.languageId != null) return false;
        if (originalLanguageId != null ? !originalLanguageId.equals(film.originalLanguageId) : film.originalLanguageId != null)
            return false;
        if (rentalDuration != null ? !rentalDuration.equals(film.rentalDuration) : film.rentalDuration != null)
            return false;
        if (rentalRate != null ? !rentalRate.equals(film.rentalRate) : film.rentalRate != null) return false;
        if (length != null ? !length.equals(film.length) : film.length != null) return false;
        if (replacementCost != null ? !replacementCost.equals(film.replacementCost) : film.replacementCost != null)
            return false;
        if (rating != null ? !rating.equals(film.rating) : film.rating != null) return false;
        if (specialFeatures != null ? !specialFeatures.equals(film.specialFeatures) : film.specialFeatures != null)
            return false;
        if (lastUpdate != null ? !lastUpdate.equals(film.lastUpdate) : film.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = filmId != null ? filmId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (releaseYear != null ? releaseYear.hashCode() : 0);
        result = 31 * result + (languageId != null ? languageId.hashCode() : 0);
        result = 31 * result + (originalLanguageId != null ? originalLanguageId.hashCode() : 0);
        result = 31 * result + (rentalDuration != null ? rentalDuration.hashCode() : 0);
        result = 31 * result + (rentalRate != null ? rentalRate.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (replacementCost != null ? replacementCost.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (specialFeatures != null ? specialFeatures.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
