package com.videostore.model;

import javax.persistence.*;

/**
 * Created by Tim on 1/14/2016.
 */
@Entity
@Table(name = "staff_list", schema = "sakila", catalog = "")
public class StaffList {
    private Byte id;
    private String name;
    private String address;
    private String zipCode;
    private String phone;
    private String city;
    private String country;
    private Byte sid;

    @Id
    @Column(name = "ID")
    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "zip code")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "SID")
    public Byte getSid() {
        return sid;
    }

    public void setSid(Byte sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StaffList staffList = (StaffList) o;

        if (id != null ? !id.equals(staffList.id) : staffList.id != null) return false;
        if (name != null ? !name.equals(staffList.name) : staffList.name != null) return false;
        if (address != null ? !address.equals(staffList.address) : staffList.address != null) return false;
        if (zipCode != null ? !zipCode.equals(staffList.zipCode) : staffList.zipCode != null) return false;
        if (phone != null ? !phone.equals(staffList.phone) : staffList.phone != null) return false;
        if (city != null ? !city.equals(staffList.city) : staffList.city != null) return false;
        if (country != null ? !country.equals(staffList.country) : staffList.country != null) return false;
        if (sid != null ? !sid.equals(staffList.sid) : staffList.sid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        return result;
    }
}
