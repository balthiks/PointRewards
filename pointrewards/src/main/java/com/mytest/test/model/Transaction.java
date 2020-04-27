/* balanithya created on 4/26/2020 inside the package - com.mytest.test.model */


package com.mytest.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
public class Transaction extends Reward {

    @Id
    @GeneratedValue
    private Long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private Customer customer;
    private Double total;
    private String purchasedetails;
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchasedate;

    public Transaction() {
        super();
    }
    public Transaction(Long id, Customer customer, Double total, String purchasedetails, Date purchasedate) {
        this.id = id;
        this.customer = customer;
        this.total = total;
        this.purchasedetails = purchasedetails;
        this.purchasedate = purchasedate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }


    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    @Override
    public Long getPoints() {
        this.points = 0l;

        if (this.total > 50 && this.total <= 100) {
            this.points += (this.total.intValue() - 50) * 1;

        }

        if (this.total > 100) {
            this.points += 50;
            this.points += (this.total.intValue() - 100) * 2;
        }


        return this.points;

    }

    public String getPurchasedetails() {
        return purchasedetails;
    }

    public void setPurchasedetails(String purchasedetails) {
        this.purchasedetails = purchasedetails;
    }

    @Override
    public String toString() {
        return String.format("Transaction [id=%s, customer=%s, total=%s, purchasedetails=%s, purchasedate=%s]", id, customer,
                total, purchasedetails, purchasedate);
    }
}
