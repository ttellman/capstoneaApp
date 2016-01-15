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
public class Store {
    private Byte storeId;
    private Byte managerStaffId;
    private Short addressId;
    private Date lastUpdate;

    @Id
    @Column(name = "store_id")
    public Byte getStoreId() {
        return storeId;
    }

    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "manager_staff_id")
    public Byte getManagerStaffId() {
        return managerStaffId;
    }

    public void setManagerStaffId(Byte managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    @Basic
    @Column(name = "address_id")
    public Short getAddressId() {
        return addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
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

        Store store = (Store) o;

        if (storeId != null ? !storeId.equals(store.storeId) : store.storeId != null) return false;
        if (managerStaffId != null ? !managerStaffId.equals(store.managerStaffId) : store.managerStaffId != null)
            return false;
        if (addressId != null ? !addressId.equals(store.addressId) : store.addressId != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(store.lastUpdate) : store.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = storeId != null ? storeId.hashCode() : 0;
        result = 31 * result + (managerStaffId != null ? managerStaffId.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
