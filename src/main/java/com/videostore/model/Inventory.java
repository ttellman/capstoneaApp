package com.videostore.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Tim on 1/14/2016.
 */
@Entity
public class Inventory {
    private Integer inventoryId;
    private Short filmId;
    private Byte storeId;
    private Date lastUpdate;

    @Id
    @Column(name = "inventory_id")
    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Basic
    @Column(name = "film_id")
    public Short getFilmId() {
        return filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    @Basic
    @Column(name = "store_id")
    public Byte getStoreId() {
        return storeId;
    }

    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
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

        Inventory inventory = (Inventory) o;

        if (inventoryId != null ? !inventoryId.equals(inventory.inventoryId) : inventory.inventoryId != null)
            return false;
        if (filmId != null ? !filmId.equals(inventory.filmId) : inventory.filmId != null) return false;
        if (storeId != null ? !storeId.equals(inventory.storeId) : inventory.storeId != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(inventory.lastUpdate) : inventory.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inventoryId != null ? inventoryId.hashCode() : 0;
        result = 31 * result + (filmId != null ? filmId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
