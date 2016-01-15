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
public class Rental {
    private Integer rentalId;
    private Date rentalDate;
    private Integer inventoryId;
    private Short customerId;
    private Date returnDate;
    private Byte staffId;
    private Date lastUpdate;

    @Id
    @Column(name = "rental_id")
    public Integer getRentalId() {
        return rentalId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    @Basic
    @Column(name = "rental_date")
    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    @Basic
    @Column(name = "inventory_id")
    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Basic
    @Column(name = "customer_id")
    public Short getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "return_date")
    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Basic
    @Column(name = "staff_id")
    public Byte getStaffId() {
        return staffId;
    }

    public void setStaffId(Byte staffId) {
        this.staffId = staffId;
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

        Rental rental = (Rental) o;

        if (rentalId != null ? !rentalId.equals(rental.rentalId) : rental.rentalId != null) return false;
        if (rentalDate != null ? !rentalDate.equals(rental.rentalDate) : rental.rentalDate != null) return false;
        if (inventoryId != null ? !inventoryId.equals(rental.inventoryId) : rental.inventoryId != null) return false;
        if (customerId != null ? !customerId.equals(rental.customerId) : rental.customerId != null) return false;
        if (returnDate != null ? !returnDate.equals(rental.returnDate) : rental.returnDate != null) return false;
        if (staffId != null ? !staffId.equals(rental.staffId) : rental.staffId != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(rental.lastUpdate) : rental.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rentalId != null ? rentalId.hashCode() : 0;
        result = 31 * result + (rentalDate != null ? rentalDate.hashCode() : 0);
        result = 31 * result + (inventoryId != null ? inventoryId.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (returnDate != null ? returnDate.hashCode() : 0);
        result = 31 * result + (staffId != null ? staffId.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
