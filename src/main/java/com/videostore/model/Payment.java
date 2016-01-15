package com.videostore.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Tim on 1/14/2016.
 */
@Entity
public class Payment {
    private Short paymentId;
    private Short customerId;
    private Byte staffId;
    private Integer rentalId;
    private BigDecimal amount;
    private Date paymentDate;
    private Date lastUpdate;

    @Id
    @Column(name = "payment_id")
    public Short getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Short paymentId) {
        this.paymentId = paymentId;
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
    @Column(name = "staff_id")
    public Byte getStaffId() {
        return staffId;
    }

    public void setStaffId(Byte staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "rental_id")
    public Integer getRentalId() {
        return rentalId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    @Basic
    @Column(name = "amount")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "payment_date")
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
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

        Payment payment = (Payment) o;

        if (paymentId != null ? !paymentId.equals(payment.paymentId) : payment.paymentId != null) return false;
        if (customerId != null ? !customerId.equals(payment.customerId) : payment.customerId != null) return false;
        if (staffId != null ? !staffId.equals(payment.staffId) : payment.staffId != null) return false;
        if (rentalId != null ? !rentalId.equals(payment.rentalId) : payment.rentalId != null) return false;
        if (amount != null ? !amount.equals(payment.amount) : payment.amount != null) return false;
        if (paymentDate != null ? !paymentDate.equals(payment.paymentDate) : payment.paymentDate != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(payment.lastUpdate) : payment.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paymentId != null ? paymentId.hashCode() : 0;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (staffId != null ? staffId.hashCode() : 0);
        result = 31 * result + (rentalId != null ? rentalId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (paymentDate != null ? paymentDate.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
